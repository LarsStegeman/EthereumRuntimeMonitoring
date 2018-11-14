pragma solidity ^0.4.24;

contract TypeError {
    uint256 a = 5;
    //@ inv a == b

    address a1;
    address a2;
    //@ inv a1 + a2  >  5

}