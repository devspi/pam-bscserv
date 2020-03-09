package com.pam.bsc.scholarship.noscholarshipcertificate

import com.pam.bsc.referential.ScholarLevel

class NoScholarshipChild {

    String familyName
    String lastName
    ScholarLevel scholarLevel

    static belongsTo = [parentEntry: NoScholarshipEntry]

    static constraints = {
        familyName blank: false
        lastName blank: false
        scholarLevel enumType: "string", blank: false
    }

    @Override
    String toString() {
        return familyName + " " + lastName + " - " + scholarLevel
    }
}
