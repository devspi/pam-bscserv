package com.pam.bsc.referential

import com.pam.bsc.response.ReferentialResponse
import grails.converters.JSON

class ReferentialController {

    def scholarLevels() {
        render new ReferentialResponse(ScholarLevel.values()) as JSON
    }

    def maritalStatus() {
        render new ReferentialResponse(MaritalStatus.values()) as JSON
    }

    def professionalStatus() {
        render new ReferentialResponse(ProfessionalStatus.values()) as JSON
    }

    def childLinks() {
        render new ReferentialResponse(ChildLink.values()) as JSON
    }

    def socialSecurityOrga() {
        render new ReferentialResponse(SocialSecurityOrganism.values()) as JSON
    }
}
