package com.example.ordermaster.infrastructure.partner

import com.example.ordermaster.domain.partner.Partner
import com.example.ordermaster.domain.partner.PartnerStore
import org.apache.commons.lang3.StringUtils
import org.springframework.stereotype.Component

@Component
class PartnerStoreImpl(
    private val partnerRepository: PartnerRepository
) : PartnerStore {

    override fun store(initPartner: Partner): Partner {
        if(StringUtils.isEmpty(initPartner.partnerToken)) throw InvalidParamException("partner.partnerToken")

    }
}