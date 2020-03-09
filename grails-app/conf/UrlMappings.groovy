class UrlMappings {

    static mappings = {
        "/api/login"(controller: 'authentication', action: "login")
        "/api/simulate"(controller: 'simulation', action: "simulate")
        "/api/user/details"(controller: 'user', action: "userDetails")
        "/api/user/scholarshipInquiries"(controller: 'user', action: "scholarshipInquiries")
        "/api/user/updateDetails"(controller: 'user', action: "updateDetails")
        "/api/user/homeDetails"(controller: 'user', action: "homeDetails")
        "/api/referential/scholarLevels"(controller: 'referential', action: "scholarLevels")
        "/api/referential/maritalStatus"(controller: 'referential', action: "maritalStatus")
        "/api/referential/childLinks"(controller: 'referential', action: "childLinks")
        "/api/referential/professionalStatus"(controller: 'referential', action: "professionalStatus")
        "/api/referential/socialSecurityOrga"(controller: 'referential', action: "socialSecurityOrga")
        "/api/scholarship/generateNoScholarshipCertificate"(controller: 'scholarship', action: "generateNoScholarshipCertificate")
        "/"(view: "/index")
        "500"(view: '/error')
    }
}
