package com.example.ordermaster.interfaces.partner

import com.example.ordermaster.domain.partner.PartnerCommand
import com.example.ordermaster.domain.partner.PartnerInfo
import com.example.ordermaster.domain.partner.Status
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class RegisterRequest(
    @NotEmpty(message = "partnerName 는 필수값입니다.")
    val partnerName: String,
    @NotEmpty(message = "businessNo 는 필수값입니다.")
    val businessNo: String,
    @Email(message = "email 형식에 맞아야 합니다")
    @NotEmpty(message = "email 는 필수값 입니다.")
    val email: String
) {
    fun toCommand(): PartnerCommand {
        return PartnerCommand(
            partnerName = partnerName,
            businessNo = businessNo,
            email = email
        )
    }
}

data class RegisterResponse(
    val partnerToken: String,
    val partnerName: String,
    val businessNo: String,
    val email: String,
    val status: Status
) {
    companion object {
        fun of(partnerInfo: PartnerInfo): RegisterResponse {
            return partnerInfo.run {
                RegisterResponse(
                    partnerToken, partnerName, businessNo, email, status
                )
            }
        }
    }
}
