pragma solidity ^0.4.23;

contract BasicAnnotations {
    bool public b;
	address public a;
	// This is normal top level comment
	//@ pre a == a && c
	//@ inv a > a && a < a
	//
}