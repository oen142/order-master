package com.example.ordermaster.common.exception

import com.example.ordermaster.common.response.ErrorCode

open class BaseException : RuntimeException {
    private var errorCode: ErrorCode? = null

    constructor() {}
    constructor(errorCode: ErrorCode) : super(errorCode.errorMsg) {
        this.errorCode = errorCode
    }

    constructor(message: String?, errorCode: ErrorCode?) : super(message) {
        this.errorCode = errorCode
    }

    constructor(message: String?, errorCode: ErrorCode?, cause: Throwable?) : super(
        message,
        cause
    ) {
        this.errorCode = errorCode
    }
}
