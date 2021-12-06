package com.example.ordermaster.infrastructure.partner

import com.example.ordermaster.domain.partner.Partner
import org.springframework.data.jpa.repository.JpaRepository

interface PartnerRepository : JpaRepository<Partner, Long> {
    fun findByPartnerToken(partnerToken: String): Partner?
}