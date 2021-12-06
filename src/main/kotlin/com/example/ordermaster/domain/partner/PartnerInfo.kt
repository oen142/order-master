package com.example.ordermaster.domain.partner

class PartnerInfo(
    var id: Long,
    var partnerToken: String,
    var partnerName: String,
    var businessNo: String,
    var email: String,
    var status: Status
) {

    companion object {
        fun of(partner: Partner): PartnerInfo {
            return partner.run {
                PartnerInfo(
                    id = partner.id!!,
                    partnerToken = partner.partnerToken,
                    partnerName = partner.partnerName,
                    businessNo = partner.businessNo,
                    email = partner.email,
                    status = partner.status
                )
            }
        }
    }


}