package com.pam.bsc.response

import com.pam.bsc.resources.SimulationFormResource

class SimulatorResponse {
    String message
    boolean scholarshipOK
    SimulationFormResource form

    SimulatorResponse(String message, boolean scholarshipOK, SimulationFormResource form) {
        this.message = message
        this.scholarshipOK = scholarshipOK
        this.form = form
    }
}
