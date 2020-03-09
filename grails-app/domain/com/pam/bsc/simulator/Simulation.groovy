package com.pam.bsc.simulator

class Simulation {
    String city
    BigDecimal income
    Integer nbrHandi
    Integer nbrChildren
    List children

    static hasMany = [children: SimulationChild]

    static constraints = {
        city blank: false
        income blank: false
        nbrHandi blank: false
        nbrChildren blank: false
    }
}
