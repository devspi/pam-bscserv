package com.pam.bsc.resources

import grails.validation.Validateable

class SimulationFormResource {
    String city
    BigDecimal income
    Integer nbrHandi
    Integer nbrChildren
    List<SimulationChildFormResource> children

    static class SimulationChildFormResource {
        Date dateOfBirth
        String scholarLevel
    }
}
