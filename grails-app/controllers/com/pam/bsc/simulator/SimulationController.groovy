package com.pam.bsc.simulator

import com.pam.bsc.resources.SimulationFormResource
import com.pam.bsc.response.SimulatorResponse
import grails.converters.JSON

class SimulationController {

    def simulate(SimulationFormResource formResource) {
        if (formResource.getIncome() > 10)
            render([data: new SimulatorResponse("Impossible d'avoir une bourse", false, formResource)] as JSON)
        else
            render([data: new SimulatorResponse('Bourse OK', true, formResource)] as JSON)
    }
}
