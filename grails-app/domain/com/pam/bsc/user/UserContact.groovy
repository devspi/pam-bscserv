package com.pam.bsc.user

class UserContact {
    String phoneWork
    String phoneHome
    String phoneCell

    static belongsTo = [user: User]

    static constraints = {
        phoneCell blank: false
        phoneWork nullable: true
        phoneHome nullable: true
    }
}
