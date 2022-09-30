package com.itram.pattern.factory.domain

class ValidatorFactory {

    fun getValidator(userDocument: String?): DocumentValidator? =
        when {
            isDni(userDocument) -> DniValidator(userDocument)
            isNie(userDocument) -> NieValidator(userDocument)
            else -> {
                null
            }
        }

    private fun isDni(userDocument: String?) = true
    private fun isNie(userDocument: String?) = true
}