pragma solidity ^0.4.23;
contract LARVA_myContract {
    modifier LARVA_DEA_1_handle_after_assignment_number {
        _;
        if ((LARVA_STATE_1 == 0) && (number > 0)) {
            LARVA_STATE_1 = 0;
        } else {
        }
    }
    int8 LARVA_STATE_1 = 0;
    function LARVA_set_number_pre (uint _number) LARVA_DEA_1_handle_after_assignment_number public returns (uint) {
        LARVA_previous_number = number;
        number = _number;
        return LARVA_previous_number;
    }
    function LARVA_set_number_post (uint _number) LARVA_DEA_1_handle_after_assignment_number public returns (uint) {
        LARVA_previous_number = number;
        number = _number;
        return number;
    }
    uint private LARVA_previous_number;
    function LARVA_myContract () public {
    }
    function LARVA_reparation () private {
    }
    function LARVA_satisfaction () private {
    }
    enum LARVA_STATUS {NOT_STARTED, READY, RUNNING, STOPPED}
    LARVA_STATUS private LARVA_Status = LARVA_STATUS.NOT_STARTED;
    function LARVA_EnableContract () private {
        LARVA_Status = (LARVA_Status == LARVA_STATUS.NOT_STARTED)?LARVA_STATUS.READY:LARVA_STATUS.RUNNING;
    }
    function LARVA_DisableContract () private {
        LARVA_Status = (LARVA_Status == LARVA_STATUS.READY)?LARVA_STATUS.NOT_STARTED:LARVA_STATUS.STOPPED;
    }
    modifier LARVA_ContractIsEnabled {
        require(LARVA_Status == LARVA_STATUS.RUNNING);
        _;
    }
    modifier LARVA_Constructor {
        require(LARVA_Status == LARVA_STATUS.READY);
        LARVA_Status = LARVA_STATUS.RUNNING;
        _;
    }
    uint private number;
    function setNumber (uint amount) LARVA_ContractIsEnabled public {
        LARVA_set_number_post(amount);
    }

}
