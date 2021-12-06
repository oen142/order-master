package com.example.ordermaster.infrastructure

import com.example.ordermaster.domain.notifiation.NotificationService
import org.springframework.stereotype.Component

@Component
class NotificationExecutor : NotificationService {
    override fun sendEmail(email: String, title: String, description: String) {
        println("sendEmail")
    }

    override fun sendKakao(phoneNo: String, description: String) {
        println("sendKakao")
    }

    override fun sendSms(phoneNo: String, description: String) {
        println("sendSms")
    }
}