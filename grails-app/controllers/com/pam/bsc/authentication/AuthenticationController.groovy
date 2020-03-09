package com.pam.bsc.authentication


import com.pam.bsc.resources.LoginResource
import com.pam.bsc.response.LoginResponse
import com.pam.bsc.user.User
import grails.converters.JSON

class AuthenticationController {

    def login(LoginResource login) {
        User user = User.findByEmailAndPassword(login.email, login.password)
        if (user) {
            render new LoginResponse(user: user, token: 'fake-token') as JSON
        } else
            render([status: 401, text: 'Email ou mot de passe incorrects'])
    }
}
