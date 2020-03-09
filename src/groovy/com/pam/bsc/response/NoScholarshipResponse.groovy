package com.pam.bsc.response

import com.pam.bsc.resources.NoScholarshipFormResource

class NoScholarshipResponse {
    String message
    String certificateUrl
    NoScholarshipFormResource form

    NoScholarshipResponse(String message, String certificateUrl, NoScholarshipFormResource form) {
        this.message = message
        this.certificateUrl = certificateUrl
        this.form = form
    }
}
