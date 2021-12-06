package com.example.ordermaster.interfaces.partner

import com.example.ordermaster.application.partner.PartnerFacade
import com.example.ordermaster.common.response.CommonResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/partners")
class PartnerApiController(
    private val partnerFacade: PartnerFacade
) {

    @PostMapping
    fun registerPartner(
        @RequestBody @Valid request: RegisterRequest
    ): CommonResponse<Any> {
        val command = request.toCommand()
        val partnerInfo = partnerFacade.registerPartner(command)
        val response = RegisterResponse.of(partnerInfo)
        return CommonResponse.success(response)
    }
}