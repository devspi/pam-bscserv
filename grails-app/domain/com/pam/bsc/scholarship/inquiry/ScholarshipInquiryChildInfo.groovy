package com.pam.bsc.scholarship.inquiry

import com.pam.bsc.referential.ScholarLevel

class ScholarshipInquiryChildInfo {
    String gender
    String familyName
    String firstName
    Date dateOfBirth
    Number prctHandi
    ScholarLevel lastYearScholarLevel
    ScholarLevel nextYearScholarLevel
    String nextYearSchool
    boolean unschooled

    static belongsTo = [inquiryDetail: ScholarshipInquiryDetail]

    static constraints = {
        gender blank: false
        familyName blank: false
        firstName blank: false
        dateOfBirth blank: false
        prctHandi nullable: true

        lastYearScholarLevel nullable: false
        nextYearScholarLevel nullable: false
        nextYearSchool nullable: false
        unschooled nullable: false
    }
}
