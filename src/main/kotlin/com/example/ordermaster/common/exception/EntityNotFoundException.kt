package com.example.ordermaster.common.exception

import com.example.ordermaster.common.response.ErrorCode

class EntityNotFoundException : BaseException {

    constructor() : super(ErrorCode.COMMON_INVALID_PARAMETER)

    constructor(message: String) : super(message, ErrorCode.COMMON_INVALID_PARAMETER)
}