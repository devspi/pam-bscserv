package com.pam.bsc.response


import com.pam.bsc.user.ChildInfo

import java.util.stream.Collectors

class UserHomeResponse {
    Long userId
    List childrenInfo

    UserHomeResponse(final Long userId, List<ChildInfo> childrenInfo) {
        this.userId = userId
        this.childrenInfo = childrenInfo.stream().map({ inquiry ->
            new SimplifiedChildInfo(
                    gender: inquiry.gender,
                    familyName: inquiry.familyName,
                    firstName: inquiry.firstName,
                    dateOfBirth: inquiry.dateOfBirth,
                    prctHandi: inquiry.prctHandi,
                    scholarLevel: inquiry.scholarLevel.name(),
                    scholarship: inquiry.scholarship,
            )
        }).collect(Collectors.toList())
    }

    static private class SimplifiedChildInfo {
        String gender
        String familyName
        String firstName
        Date dateOfBirth
        Number prctHandi
        String scholarLevel
        boolean scholarship
    }
}
