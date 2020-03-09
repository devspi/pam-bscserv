package com.pam.bsc.user

import com.pam.bsc.resources.UserDetailResource
import com.pam.bsc.resources.UserResource
import com.pam.bsc.response.UserDetailResponse
import com.pam.bsc.response.UserHomeResponse
import com.pam.bsc.response.UserScholarshipInquiriesResponse
import grails.converters.JSON

class UserController {

    def userDetails(UserResource resource) {
        User user = User.findById(resource.userId)
        if (user) {
            render new UserDetailResponse(user.id, user.getAddressInfo(), user.getBankInfo(), user.getContactInfo()) as JSON
        } else {
            render([status: 404, text: 'Utilisateur ' + resource.userId + ' inconnu'])
        }
    }

    def homeDetails(UserResource resource) {
        User user = User.findById(resource.userId)
        if (user) {
            render new UserHomeResponse(user.id, user.getChildrenInfo()) as JSON
        } else {
            render([status: 404, text: 'Utilisateur ' + resource.userId + ' inconnu'])
        }
    }

    def updateDetails(UserDetailResource resource) {
        try {
            User user = User.findById(resource.user.userId)
            if (user) {
                if (resource.addressInfo)
                    user.setAddressInfo(resource.addressInfo)
                if (resource.bankInfo)
                    user.setBankInfo(resource.bankInfo)
                if (resource.contactInfo)
                    user.setContactInfo(resource.contactInfo)
                user.save(flush: true)
                render new UserDetailResponse(user.id, user.getAddressInfo(), user.getBankInfo(), user.getContactInfo()) as JSON
            } else {
                render([status: 404, text: 'Utilisateur ' + resource.user.userId + ' inconnu'])
            }
        } catch (Exception e) {
            render status: 404
        }
    }

    def scholarshipInquiries(UserResource resource) {
        User user = User.findById(resource.userId)
        if (user) {
            render new UserScholarshipInquiriesResponse(user.id, user.getScholarshipInquiries()) as JSON
        } else {
            render([status: 404, text: 'Utilisateur ' + resource.userId + ' inconnu'])
        }
    }
}
