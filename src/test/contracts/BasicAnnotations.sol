pragma solidity ^0.4.23;

contract BasicAnnotations {
    bool public b;
	address public a;
	// This is normal top level comment
	//@ inv a == a && c
	//@ inv a > a && a < a
	//@ inv !a


	uint256 n1;
	uint256 n2;
	address adr1;
	address adr2;
	//Test for correct scoping
	//@ inv (n1 == n2) && (adr1 == adr2)


	// This tests pre and post conditions
	//@ pre (c + 1) > c
	//@ post r
	function testFunction(address c) pure public{}

	mapping(address => uint256) map;

}