package com.galid.account_platform.account.domains

import javax.persistence.Embeddable

/**
 * franchise 관련 정보
 */
@Embeddable
class FranchiseInfo(
    var franchiseId: Long
) {
}