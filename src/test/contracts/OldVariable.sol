pragma solidity ^0.4.23;

contract OldVariable {
    uint256 a;
    
    //@ post \old(a) <= a
    function fun(uint256 number) public{
        a += number;
    }
}