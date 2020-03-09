package com.pam.bsc.response

import com.pam.bsc.referential.ChildLink
import com.pam.bsc.referential.MaritalStatus
import com.pam.bsc.referential.ProfessionalStatus
import com.pam.bsc.referential.ScholarLevel
import com.pam.bsc.referential.SocialSecurityOrganism

class ReferentialResponse {
    String type
    String[] data

    ReferentialResponse(ScholarLevel[] scholarLevels) {
        this.type = "ScholarLevel"
        this.data = Arrays.stream(scholarLevels).map({ level -> level.toString() }).collect().toArray()
    }

    ReferentialResponse(MaritalStatus[] maritalStatuses) {
        this.type = "MaritalStatus"
        this.data = Arrays.stream(maritalStatuses).map({ status -> status.toString() }).collect().toArray()
    }

    ReferentialResponse(ChildLink[] childLinks) {
        this.type = "ChildLink"
        this.data = Arrays.stream(childLinks).map({ link -> link.toString() }).collect().toArray()
    }

    ReferentialResponse(ProfessionalStatus[] proStatus) {
        this.type = "ProfessionalStatus"
        this.data = Arrays.stream(proStatus).map({ status -> status.toString() }).collect().toArray()
    }

    ReferentialResponse(SocialSecurityOrganism[] orgas) {
        this.type = "SocialSecurityOrganism"
        this.data = Arrays.stream(orgas).map({ orga -> orga.toString() }).collect().toArray()
    }
}
