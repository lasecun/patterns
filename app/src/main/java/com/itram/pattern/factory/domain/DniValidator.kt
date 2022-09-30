package com.itram.pattern.factory.domain

class DniValidator(userDocument: String?): DocumentValidator {

    //It is needed to implement the logic
    override fun validate(): Boolean = true
}