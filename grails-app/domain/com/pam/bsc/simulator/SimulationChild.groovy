package com.pam.bsc.simulator

import com.pam.bsc.referential.ScholarLevel

class SimulationChild {
    Date dateOfBirth
    ScholarLevel scholarLevel

    static belongsTo = [simulation: Simulation]

    static constraints = {
        dateOfBirth blank: false
        scholarLevel enumType: 'string', blank: false
    }

    @Override
    String toString() {
        return dateOfBirth.toString() + " " + scholarLevel
    }
}
