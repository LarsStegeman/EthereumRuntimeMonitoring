pragma solidity ^0.4.23;

contract SimpleToken {
	/* This creates an array with all balances */
	mapping (address => uint256) public balanceOf;
	/* TotalSupply is fixed for this token, and does not change. */
	/* It is assigned in the constructor */
	uint256 totalSupply;


	/* Initializes contract with initial supply tokens to the creator of the contract */
	function SimpleToken(uint256 initialSupply) public {
		// Give the creator all initial tokens
		balanceOf[msg.sender] = initialSupply;              
		totalSupply = initialSupply;
	}

	/* Send coins */
	//@ post balanceOf[_to] == (\old(balanceOf[_to]) + _value) && balanceOf[msg.sender] == (\old(balanceOf[msg.sender]) - _value) && \forall(x in balanceOf: (x != _to && x != msg.sender) -> balanceOf[x] == \old(balanceOf[x])) && msg.sender != _to
	function transfer(address _to, uint256 _value) public {
		// Check if the sender has enough
		require(balanceOf[msg.sender] >= _value);
		// Check for overflows
		require(balanceOf[_to] + _value >= balanceOf[_to]); 
		// Subtract from the sender
		balanceOf[msg.sender] -= _value;    
		// Add the same to the recipient		
		balanceOf[_to] += _value; 
	}
}