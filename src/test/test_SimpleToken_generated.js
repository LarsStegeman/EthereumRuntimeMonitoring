var SimpleToken = artifacts.require("./SimpleToken.sol");

contract("SimpleToken", function(accounts) {
    let acc1    = accounts[0];
    let acc2    = accounts[1];
    let acc3    = accounts[2];

    it("send 100 to account 2", function() {
        return SimpleToken.deployed().then(function(instance) {
          return instance.transfer(acc2, 100);
        });
    });
    it("send 10 to account 3", function() {
        return SimpleToken.deployed().then(function(instance) {
          return instance.transfer(acc3, 10);
        });
    });
    it("send 100 back to account 1", function() {
        return SimpleToken.deployed().then(function(instance) {
          return instance.transfer(acc1, 100, {from: acc2});
        });
    });
    it("send 100 to self", function() {
        return SimpleToken.deployed().then(function(instance) {
          return instance.transfer(acc1, 100);
        });
    });
    it("send 1000 to acc3, should fail", function() {
        return SimpleToken.deployed().then(function(instance) {
          return instance.transfer(acc3, 1000).then(function (result){
                throw null;
            }).catch(function (e) {
                assert(e, "Expected an error but did not get one");
            });
        });
    });
});