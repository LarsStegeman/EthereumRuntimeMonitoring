pragma solidity ^0.4.24;

contract ParseError {
    uint256 a = 5;
    //@ inv getNumber() == a

    function getNumber() returns(uint256){
        //...
    }

    //@ post old(_a + _b) == _a + _b
    function doSomething(uint256 _a, uint256 _b){
        //...
    }
}