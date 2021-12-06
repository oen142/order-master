package com.example.ordermaster.common.response

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class CommonControllerAdvice(
) {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = [Exception::class])
    fun onException() {

    }

    companion object {
        val SPECIFIC_ALERT_TARGET_ERROR_CODE_LIST: List<ErrorCode> = arrayListOf()
    }

}