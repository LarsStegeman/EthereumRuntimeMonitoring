pragma solidity ^0.4.23;

contract DataStructures {
    struct A{
        B b;
    }

    struct B{
        uint256 c;
    }

    A a;
    // Should be an INTEGER
    // a is type struct with reference "A"
    // b is type struct with reference "B"
    // "A" and "B" are struct definitions
    // Struct definitions are essentially the same as function definitions
    // Type lookup should happen recursively through all structs and references
    
    //@ inv a.b.c == 5


    //@ post a.b.c == \old(a.b.c)
    function newFunction() public {}
    
}