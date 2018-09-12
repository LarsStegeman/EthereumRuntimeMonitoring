pragma solidity ^0.4.23;

contract Mapping {
    //Single mapping reference by address
    mapping(address => uint256) a;
    address public b;
    //@ inv a[b] == 5

    //Double mapping
    mapping(address => mapping (address => uint256)) doubleMap;
    address public c;
    //@ inv doubleMap[c][c]

    //Complex mappings with structs
    mapping(uint256 => S) mapToStruct;
    struct S{
        uint256 n1;
        address a1;
        bool b1;
    }
    //@ inv mapToStruct[5].b1


    //@ post a[_to] == a[_to]
    function testOldMapping(address _to, uint256 _value) public{

    }


    //@ inv \forall(x in a: a[x] > 0 )
}