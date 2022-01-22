package com.galid.account_platform.account.domains

import javax.persistence.Embeddable

/**
 * 인증 등 계정 정보 관련
 */
@Embeddable
class AccountInfo(
    var email: String,
    var memberId: Long? = null,
    var authId: String?,
    var authPw: String?,
) {
}