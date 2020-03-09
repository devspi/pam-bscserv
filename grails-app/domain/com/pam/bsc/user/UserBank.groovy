package com.pam.bsc.user

class UserBank {
    String bankName
    String bankAddress
    String iban
    String bic
    String bankCode
    String codeGuichet
    String accountNbr
    String ribKey

    static belongsTo = [user: User]

    static constraints = {
        bankName blank: false
        bankCode blank: false
        codeGuichet blank: false
        accountNbr blank: false
        ribKey blank: false

        bankAddress nullable: true
        iban nullable: true
        bic nullable: true
    }
}
