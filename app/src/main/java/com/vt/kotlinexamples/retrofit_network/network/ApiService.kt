package com.vt.kotlinexamples.retrofit_network.network

import retrofit2.http.GET
import com.vt.kotlinexamples.retrofit_network.network.model.appupdate.AppUpdateResp
import retrofit2.Call
import retrofit2.http.Query

interface ApiService {

    @GET("api/v2/app-version/retrieve")
    fun getAppUpdate(@Query("osType") osType: String?): Call<AppUpdateResp?>?
}