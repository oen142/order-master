package com.example.ordermaster.domain.partner

class PartnerCommand(
    private val partnerName: String,
    private val businessNo: String,
    private val email: String
) {

    fun toEntity(): Partner {
        return Partner(
            partnerName = partnerName,
            businessNo = businessNo,
            email = email
        )
    }

}