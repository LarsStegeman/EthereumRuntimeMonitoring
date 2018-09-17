pragma solidity ^0.4.23;

contract LogContract {

    address public admin;
    uint256 public nrOfMessages;
    Message[] public messages;

    struct Message {
        address sender;
        string msg;
    }

    constructor() public{
        admin = msg.sender;
    }
    //@ post admin == \old(admin) && (nrOfMessages == (\old(nrOfMessages) + 1))
    function logMessage(string _msg) public{
        Message message;
        message.sender = msg.sender;
        message.msg = _msg;
        messages.push(message);
        nrOfMessages++;
    }
    
}