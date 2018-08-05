pragma solidity ^0.4.23;

contract Array {
    // Normal array
    uint256[] a;
    uint256 b;
    //@ inv a[b]

    //Double array
    address[][] adr;
    //@ inv adr[c][c]

    //Complex array with structs
    S[] arrayOfStruct;
    struct S{
        uint256 n1;
        address a1;
        bool b1;
    }
    //@ inv arrayOfStruct[5].b1
}