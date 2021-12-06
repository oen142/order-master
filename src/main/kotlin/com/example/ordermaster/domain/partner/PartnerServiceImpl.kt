package com.example.ordermaster.domain.partner

import org.springframework.stereotype.Service

@Service
class PartnerServiceImpl(
    private val partnerStore: PartnerStore,
    private val partnerReader: PartnerReader
) : PartnerService {
    override fun registerPartner(command: PartnerCommand): PartnerInfo {
        TODO("Not yet implemented")
    }

    override fun getPartnerInfo(partnerToken: String): PartnerInfo {
        TODO("Not yet implemented")
    }

    override fun enablePartner(partnerToken: String): PartnerInfo {
        TODO("Not yet implemented")
    }

    override fun disablePartner(partnerToken: String): PartnerInfo {
        TODO("Not yet implemented")
    }
}