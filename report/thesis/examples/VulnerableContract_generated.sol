pragma solidity ^0.4.23;

contract LogContract {

    address public admin;
    uint256 public nrOfMessages;
    Message[] public messages;

    struct Message {
        address sender;
        string msg;
    }

    constructor(){
        admin = msg.sender;
    }
    //@ post admin == \old(admin) && (nrOfMessages == (\old(nrOfMessages) + 1))
    function annotation0(address admin_old, uint256 nrOfMessages_old) view private{ 
        assert(admin==admin_old&&(nrOfMessages==(nrOfMessages_old+1)));
    }

    function logMessage(string _msg) public{
        address admin_old = admin;
        uint256 nrOfMessages_old = nrOfMessages;
        logMessage_body(_msg);
        annotation0(admin_old, nrOfMessages_old);
    }
    function logMessage_body(string _msg) private{
        Message message;
        message.sender = msg.sender;
        message.msg = _msg;
        messages.push(message);
        nrOfMessages++;
    }
    
}