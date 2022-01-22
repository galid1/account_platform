package com.galid.account_platform.account.domains

import javax.persistence.*

@Entity
class BusinessAccountEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Embedded
    val accountInfo: AccountInfo,
    @Embedded
    val businessInfo: BusinessInfo,
    @Embedded
    val franchiseInfo: FranchiseInfo
) {
}