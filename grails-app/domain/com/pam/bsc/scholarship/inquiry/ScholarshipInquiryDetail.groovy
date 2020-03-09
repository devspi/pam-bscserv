package com.pam.bsc.scholarship.inquiry

import com.pam.bsc.referential.ChildLink
import com.pam.bsc.referential.MaritalStatus
import com.pam.bsc.referential.ProfessionalStatus

class ScholarshipInquiryDetail {

    Identity identity
    List childrenInfo

    static hasMany = [childrenInfo: ScholarshipInquiryChildInfo]
    static belongsTo = [inquiry: ScholarshipInquiry]
    static embedded = ['identity']

    static constraints = {
    }

    static class Identity {
        Applicant applicant
        Applicant conjoint
        static embedded = ['applicant', 'conjoint']
    }

    static class Applicant {
        String birthName
        String marriedName
        String firstName
        Date dateOfBirth
        String placeOfBirth
        String nationality
        BigDecimal prctHandi

        MaritalStatus maritalStatus
        Date maritalSituationDate

        ChildLink childLink
        String childLinkPrecision

        ProfessionalStatus proSituation
        Date proSituationDate
        String proEmployerName
        String proJobTitle;

        BigDecimal incomeMonthlyPay
        BigDecimal incomePension
        BigDecimal incomeLiberal
        BigDecimal incomeOther

        static constraints = {
            birthName blank: false
            marriedName nullable: true
            firstName blank: false
            dateOfBirth blank: false
            placeOfBirth blank: false
            nationality blank: false
            prctHandi nullable: true

            incomeOther nullable: true
            incomeLiberal nullable: true
            incomePension nullable: true
            incomeMonthlyPay blank: false

            proJobTitle nullable: true
            proEmployerName nullable: true
            proSituationDate nullable: true
            proSituation nullable: false

            childLink nullable: false
            childLinkPrecision nullable: true

            maritalStatus nullable: false
            maritalSituationDate nullable: true
        }
    }
}
