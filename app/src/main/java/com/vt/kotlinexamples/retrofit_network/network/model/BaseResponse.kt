package com.vt.kotlinexamples.retrofit_network.network.model


open class BaseResponse {
    var status: String? = null
    var timestamp: String? = null
    var error: Error? = null
}