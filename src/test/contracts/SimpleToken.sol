pragma solidity ^0.4.20;

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
	bool public b;
	address public a;
	// This is normal top level comment
	//@ pre a == a && c
	//@ inv a > a && a < a
	//
	// this @ is a comment
	/* I can use @ here */
	/* Send coins */
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