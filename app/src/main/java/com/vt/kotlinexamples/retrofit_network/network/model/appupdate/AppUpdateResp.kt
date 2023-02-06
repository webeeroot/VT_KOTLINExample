package com.vt.kotlinexamples.retrofit_network.network.model.appupdate

import com.vt.kotlinexamples.retrofit_network.network.model.BaseResponse
import com.vt.kotlinexamples.retrofit_network.network.model.appupdate.AppUpdateData

class AppUpdateResp : BaseResponse() {
    var data: AppUpdateData? = null
}