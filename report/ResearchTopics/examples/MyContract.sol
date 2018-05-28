pragma solidity ^0.4.23;

contract myContract {
    
    uint public number;

    function setNumber(uint amount) public{
        number = amount;        
    }
}