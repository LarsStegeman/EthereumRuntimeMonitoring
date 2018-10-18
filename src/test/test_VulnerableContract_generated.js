var VulnerableContract = artifacts.require("./LogContract.sol");

contract("VulnerableContract", function(accounts) {

    it("logs message, should throw error", function() {
        return VulnerableContract.deployed().then(function(instance) {
          return instance.logMessage("test").then(function (result){
                throw null;
            }).catch(function (e) {
                assert(e, "Expected an error but did not get one");
            });
        });
    });
});