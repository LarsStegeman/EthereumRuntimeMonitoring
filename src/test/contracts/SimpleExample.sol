pragma solidity ^0.4.23;

contract BasicAnnotations {
    uint256 nr1;
    uint256 nr2;

    //@ inv nr1 == nr2

    //@ post \old(nr2) == nr2
	function testFunction(address c) pure public{
        //...
    }

	
}