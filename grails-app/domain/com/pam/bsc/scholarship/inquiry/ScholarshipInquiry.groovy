package com.pam.bsc.scholarship.inquiry

import com.pam.bsc.user.User
import groovy.transform.CompileStatic

class ScholarshipInquiry {
    Date dateOfDemand
    ScholarshipInquiryStatus status
    String message
    ScholarshipInquiryDetail detail

    static belongsTo = [user: User]

    static constraints = {
        status nullable: true
        dateOfDemand nullable: true
        message blank: true
        detail nullable: true
    }

    @CompileStatic
    static enum ScholarshipInquiryStatus {
        IN_PROGRESS,
        MISSING_DOCUMENT,
        ACCEPTED,
        DECLINED
    }
}
