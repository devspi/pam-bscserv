package com.pam.bsc.scholarship.noscholarshipcertificate

class NoScholarshipEntry {
    String familyName
    String lastName
    BigDecimal income
    Integer nbrChildren
    List children

    static hasMany = [children: NoScholarshipChild]

    static constraints = {
        familyName blank: false
        lastName blank: false
        income blank: false
        nbrChildren blank: false
    }
}
