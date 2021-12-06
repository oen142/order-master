package com.example.ordermaster.infrastructure.partner

import com.example.ordermaster.common.exception.EntityNotFoundException
import com.example.ordermaster.domain.partner.Partner
import com.example.ordermaster.domain.partner.PartnerReader
import org.springframework.stereotype.Component

@Component
class PartnerReadImpl(
    private val partnerRepository: PartnerRepository
) : PartnerReader {

    override fun getPartner(partnerId: Long): Partner {
        return partnerRepository.findById(partnerId)
            .orElseThrow {
                EntityNotFoundException()
            }
    }

    override fun getPartner(partnerToken: String): Partner {
        TODO("Not yet implemented")
    }

    companion object {

    }
}