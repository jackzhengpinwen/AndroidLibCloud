package io.johnsonlee.springboot.starter.helloworld.entity

class BaseResponse<T>(
    var error_code: String? = null,
    var error_msg: String? = null,
    var data: T? = null
)