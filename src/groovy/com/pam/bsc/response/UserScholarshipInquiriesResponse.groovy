package com.pam.bsc.response

import com.pam.bsc.scholarship.inquiry.ScholarshipInquiry

import java.util.stream.Collectors

class UserScholarshipInquiriesResponse {
    Long userId
    List scholarshipInquiries

    UserScholarshipInquiriesResponse(final Long userId, final List<ScholarshipInquiry> scholarshipInquiries) {
        this.userId = userId
        this.scholarshipInquiries = scholarshipInquiries.stream().map({ inquiry ->
            new SimplifiedInquiry(
                    inquiryId: inquiry.id,
                    dateOfDemand: inquiry.dateOfDemand,
                    status: inquiry.status.name(),
                    message: inquiry.message,
            )
        }).collect(Collectors.toList())
    }

    static private class SimplifiedInquiry {
        Long inquiryId
        Date dateOfDemand
        String status
        String message
    }
}
