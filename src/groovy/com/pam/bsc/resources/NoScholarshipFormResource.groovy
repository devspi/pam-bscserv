package com.pam.bsc.resources

class NoScholarshipFormResource {
    String familyName
    String firstName
    BigDecimal income
    Integer nbrChildren
    List<NoScholarshipChildFormResource> children

    static class NoScholarshipChildFormResource {

        String familyName
        String firstName
        String scholarLevel

        @Override
        String toString() {
            return familyName + " " + firstName + " - " + scholarLevel
        }
    }
}
