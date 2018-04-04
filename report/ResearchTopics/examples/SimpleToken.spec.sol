pragma solidity ^0.4.20;

contract SimpleToken {
    /* This creates an array with all balances */
    mapping (address => uint256) public balanceOf;
	/* TotalSupply is fixed for this token, and does not change. It is assigned in the constructor */
	uint256 totalSupply;
	
	
	/* @invariant totalSupply ==  sum = (forall x in balanceOf [ sum +=balanceOf[x]])

    /* Send coins */
	/* @ensures 	balanceOf[_to] == \old(balanceOf[_to]) + _value &&
					balanceOf[msg.sender] == \old(balanceOf[msg.sender]) - _value &&
					forall x : x != _to || x != msg.sender : balanceOf[x] == \old(balanceOf[x])
					||	
					forall x: balanceOf[x] == \old(balanceOf[x])
	*/
    function transfer(address _to, uint256 _value) public {
    }
}