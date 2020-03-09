package com.pam.bsc.response

import com.pam.bsc.user.UserAddress
import com.pam.bsc.user.UserBank
import com.pam.bsc.user.UserContact

class UserDetailResponse {
    Long userId
    UserAddress addressInfo
    UserBank bankInfo
    UserContact contactInfo

    UserDetailResponse(final Long userId, final UserAddress addressInfo, final UserBank bankInfo, final UserContact contactInfo) {
        this.userId = userId
        this.addressInfo = addressInfo
        this.bankInfo = bankInfo
        this.contactInfo = contactInfo
    }
}
