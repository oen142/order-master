package com.example.ordermaster.application.partner

import com.example.ordermaster.domain.notifiation.NotificationService
import com.example.ordermaster.domain.partner.PartnerCommand
import com.example.ordermaster.domain.partner.PartnerInfo
import com.example.ordermaster.domain.partner.PartnerService
import org.springframework.stereotype.Service

@Service
class PartnerFacade(
    private val partnerService: PartnerService,
    private val notificationService: NotificationService
) {

    fun registerPartner(command: PartnerCommand): PartnerInfo {
        val partnerInfo = partnerService.registerPartner(command)
        notificationService.sendEmail(partnerInfo.email, "title", "description")
        return partnerInfo
    }
}