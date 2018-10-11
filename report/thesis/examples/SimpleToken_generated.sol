pragma solidity ^0.4.23;

import "./itMapsLib.sol";

contract SimpleToken {
	/* This creates an array with all balances */
	using itMaps for itMaps.itMapUintUint;
    using itMaps for itMaps.itMapAddressUint;
    using itMaps for itMaps.itMapUintAddress;
    itMaps.itMapAddressUint balanceOf;
    itMaps.itMapAddressUint balanceOf_old;
	/* TotalSupply is fixed for this token, and does not change. */
	/* It is assigned in the constructor */
	uint256 totalSupply;


	/* Initializes contract with initial supply tokens to the creator of the contract */
	function SimpleToken(uint256 initialSupply) public {
		// Give the creator all initial tokens
		balanceOf.insert(msg.sender,initialSupply);              
		totalSupply = initialSupply;
	}

	/* Send coins */
	//@ post (balanceOf[_to] == (\old(balanceOf[_to]) + _value) && balanceOf[msg.sender] == (\old(balanceOf[msg.sender]) - _value) && \forall(x in balanceOf: (x != _to && x != msg.sender) -> balanceOf[x] == \old(balanceOf[x]))) || (msg.sender == _to  && \forall(y in balanceOf: balanceOf[y] == \old(balanceOf[y])))
    function annotation0(address _to, uint256 _value) view private{ 
        bool expression0= true;
        for(uint256 i0=0; i0<balanceOf.size() &&expression0;i0++){
            var x= balanceOf.getKeyByIndex(i0);
            expression0=!(x!=_to&&x!=msg.sender)||balanceOf.get(x)==balanceOf_old.get(x);
        }
        bool expression1= true;
        for(uint256 i1=0; i1<balanceOf.size() &&expression1;i1++){
            var y= balanceOf.getKeyByIndex(i1);
            expression1=balanceOf.get(y)==balanceOf_old.get(y);
        }
        assert((balanceOf.get(_to)==(balanceOf_old.get(_to)+_value)&&balanceOf.get(msg.sender)==(balanceOf_old.get(msg.sender)-_value)&&expression0)||(msg.sender==_to&&expression1));
    }

	function transfer(address _to, uint256 _value) public {
        balanceOf_old.destroy();
        for(uint256 mapcopy=0; mapcopy < balanceOf.size(); mapcopy++){
            balanceOf_old.insert(balanceOf.getKeyByIndex(mapcopy),balanceOf.getValueByIndex(mapcopy));
        }

        transfer_body(_to, _value);
        annotation0(_to, _value);
    }
    function transfer_body(address _to, uint256 _value) private {
		// Check if the sender has enough
		require(balanceOf.get(msg.sender) >= _value);
		// Check for overflows
		require(balanceOf.get(_to) + _value >= balanceOf.get(_to)); 
		// Subtract from the sender
		balanceOf.insert(msg.sender,balanceOf.get(msg.sender)-_value);    
		// Add the same to the recipient		
		balanceOf.insert(_to,balanceOf.get(_to)+_value); 
	}
}