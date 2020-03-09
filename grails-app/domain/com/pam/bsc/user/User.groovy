package com.pam.bsc.user

import com.pam.bsc.scholarship.inquiry.ScholarshipInquiry

class User {
    String firstName
    String familyName
    String email
    String password

    UserAddress addressInfo
    UserBank bankInfo
    UserContact contactInfo
    List scholarshipInquiries
    List childrenInfo

    static hasMany = [scholarshipInquiries: ScholarshipInquiry, childrenInfo: ChildInfo]

    static constraints = {
        firstName blank: false
        familyName blank: false
        email blank: false
        password blank: false
    }
}
