pragma solidity ^0.4.20;

contract SimpleToken {
    /* This creates an array with all balances */
    mapping (address => uint256) public balanceOf;
	/* TotalSupply is fixed for this token. It is assigned in the constructor */
	uint256 totalSupply;
	
	
	/* ----------------------------------------------------------- */
	/* Array to keep a list of in use addresses */
	address[] public addressesInUse;
	/* Struct to save the state of the balanceOf mapping */
	struct BalanceOfStruct{
	    address _address;
	    uint256 balance;
	}
	/* ----------------------------------------------------------- */
	
	
    /* Initializes contract with initial supply tokens to the creator of the contract */
    function SimpleToken(
        uint256 initialSupply
        ) public {
        balanceOf[msg.sender] = initialSupply;              // Give the creator all initial tokens
		/* ----------------------------------------------------------- */
		addressesInUse.push(msg.sender);
		/* ----------------------------------------------------------- */
		totalSupply = initialSupply;
    }

    /* Send coins */
    function transfer(address _to, uint256 _value) public {
		//Save state of current variables needed for validation of properties
		BalanceOfStruct[] memory  old_balanceOf = new BalanceOfStruct[](addressesInUse.length);
		address[] memory old_addressesInUse = new address[](addressesInUse.length);
		for(uint x; x < addressesInUse.length; x++){
			old_addressesInUse[x] = addressesInUse[x];
			old_balanceOf[x] = BalanceOfStruct(addressesInUse[x], balanceOf[addressesInUse[x]]);
		}
	
		// check invariant
		invariant();
		// check requires
		
		// execute body
		transfer_body(_to,_value);
		// check ensures
		transfer_ensures(_to, _value, old_addressesInUse, old_balanceOf);
		// check invariant
		invariant();
    }
	
	function transfer_ensures(address _to, uint256 _value, address[] _old_addressesInUse, BalanceOfStruct[] _old_balanceOf ) private{
        uint index_to;
        uint index_from;
        for(uint x; x< addressesInUse.length; x++){
            if(addressesInUse[x] == _to){
                index_to=x;
            }
            if(addressesInUse[x] == msg.sender){
                index_from = x;
            }
        }
	    bool exp1 = (balanceOf[_to] == (_old_balanceOf[index_to].balance + _value));
	    bool exp2 = (balanceOf[_to] == (_old_balanceOf[index_from].balance - _value));
	    bool exp3 = true;
	    for(x=0; x < addressesInUse.length && exp3; x++){
	        if(x != index_to || x!= index_from){
	            exp3 == (balanceOf[addressesInUse[x]] == _old_balanceOf[x].balance);
	        }
		}
		bool exp4 = true;
		for(x=0; x < addressesInUse.length && exp4; x++){
	       exp4 == (balanceOf[addressesInUse[x]] == _old_balanceOf[x].balance);
		}
		
		assert((exp1 && exp2 && exp3) || exp4);
	}
	
	function invariant() private{
		uint256 sum;
		for(uint x; x < addressesInUse.length; x++){
			sum += balanceOf[addressesInUse[x]];
		}
		assert(totalSupply == sum);
	}
	
	/* transfer function original body */
	function transfer_body(address _to, uint256 _value) private {
		require(balanceOf[msg.sender] >= _value);           // Check if the sender has enough
        require(balanceOf[_to] + _value >= balanceOf[_to]); // Check for overflows
        balanceOf[msg.sender] -= _value;                    // Subtract from the sender
        balanceOf[_to] += _value;     						// Add the same to the recipient
		/* ----------------------------------------------------------- */
		addressesInUse.push(_to);
		/* ----------------------------------------------------------- */
	}
}