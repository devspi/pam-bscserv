package com.pam.bsc.user

class UserAddress {
    String at
    String apptNbr
    String stair
    String batInfo
    String street
    String district
    String bp
    String postalCode
    String city

    static belongsTo = [user: User]

    static constraints = {
        street blank: false
        postalCode blank: false
        city blank: false

        at nullable: true
        apptNbr nullable: true
        stair nullable: true
        batInfo nullable: true
        district nullable: true
        bp nullable: true
    }
}
