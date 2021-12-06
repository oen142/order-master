package com.example.ordermaster.common.response

class CommonResponse<T>(
    val result: Result,
    val data: T,
    val message: String?,
    val errorCode: String? = null
) {

    companion object {
        fun <T> success(data: T, message: String?): CommonResponse<T> {
            return CommonResponse(
                result = Result.SUCCESS,
                data = data,
                message = message
            )
        }

        fun <T> success(data: T): CommonResponse<T> {
            return success(data)
        }
    }


}