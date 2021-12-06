package com.example.ordermaster.domain.partner

enum class Status(
    private val description: String
) {
    ENABLE("활성화"), DISABLE("비활성화")
}