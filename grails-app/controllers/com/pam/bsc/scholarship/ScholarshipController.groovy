package com.pam.bsc.scholarship

import com.pam.bsc.resources.NoScholarshipFormResource
import com.pam.bsc.response.NoScholarshipResponse
import grails.converters.JSON

class ScholarshipController {

    def generateNoScholarshipCertificate(NoScholarshipFormResource formResource) {
        render([data: new NoScholarshipResponse("Génération de l'attestation OK", "http://urlduPDFadefinir", formResource)] as JSON)
    }
}
