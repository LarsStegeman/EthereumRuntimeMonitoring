pragma solidity ^0.4.23;

contract BasicAnnotations {
    bool public b;
	address public a;
	// This is normal top level comment
	//@ pre a == a && c
	//@ inv a > a && a < a
	//@ inv !a


	uint256 n1;
	uint256 n2;
	address adr1;
	address adr2;
	//Test for correct scoping
	//@ inv (n1 == n2) && (adr1 == adr2)
}