package com.galid.account_platform.account.domains

import javax.persistence.Embeddable

/**
 * 비즈니스 관련 정보
 */
@Embeddable
class BusinessInfo(
    var storeName: String
) {
}