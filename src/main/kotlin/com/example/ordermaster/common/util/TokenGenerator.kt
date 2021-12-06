package com.example.ordermaster.common.util

import org.apache.commons.lang3.RandomStringUtils

object TokenGenerator {
    const val TOKEN_LENGTH = 20

    fun randomCharacter(length: Int): String {
        return RandomStringUtils.randomAlphanumeric(length)
    }

    fun randomCharacterWithPrefix(prefix: String): String {
        return "$prefix${randomCharacter(TOKEN_LENGTH - prefix.length)}"
    }


}