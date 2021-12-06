package com.example.ordermaster.domain.partner

interface PartnerStore {
    fun store(initPartner: Partner): Partner
}