package com.example.ordermaster.domain.partner

interface PartnerReader {

    fun getPartner(partnerId: Long): Partner
    fun getPartner(partnerToken: String): Partner
}