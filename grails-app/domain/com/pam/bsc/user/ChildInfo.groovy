package com.pam.bsc.user

import com.pam.bsc.referential.ScholarLevel

class ChildInfo {
    String gender
    String familyName
    String firstName
    Date dateOfBirth
    Number prctHandi
    ScholarLevel scholarLevel
    boolean scholarship

    static belongsTo = [user: User]

    static constraints = {
        gender blank: false
        familyName blank: false
        firstName blank: false
        dateOfBirth blank: false
        prctHandi nullable: true
        scholarLevel nullable: false
        scholarship nullable: false
    }
}
