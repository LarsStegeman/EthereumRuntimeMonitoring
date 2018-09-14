pragma solidity ^0.4.24;

contract Examples {
    uint256 nr1;
    uint256 nr2;
    //@ inv nr1 >= nr2


    address owner;
    //@ post \old(owner) == owner
    function doSomething() public{
        // ...
    }

    uint256[] a;
    //@ inv \forall(x in a: a[x] > 0)


    uint256 b;
    //@ post (msg.sender == owner) -> (\old(b) != b)
    function changeSomething() public{
        // ...
    }
}