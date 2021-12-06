package com.example.ordermaster.domain.partner

import com.example.ordermaster.domain.AbstractEntity
import javax.persistence.*

@Entity
@Table(name = "partners")
class Partner(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0L,

    var partnerToken: String? = "",
    var partnerName: String? = "",
    var businessNo: String? = "",
    var email: String? = "",
    @Enumerated(EnumType.STRING)
    var status: Status? = Status.DISABLE
) : AbstractEntity() {


    fun enable() {
        this.status = Status.ENABLE
    }

    fun disable() {
        this.status = Status.DISABLE
    }

    companion object {
        const val PREFIX_PARTNER = "ptn_"
    }

}