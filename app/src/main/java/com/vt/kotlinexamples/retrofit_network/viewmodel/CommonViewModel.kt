package com.vt.kotlinexamples.retrofit_network.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vt.kotlinexamples.retrofit_network.network.ApiClient.Companion.getInstance
import com.vt.kotlinexamples.retrofit_network.network.ApiService
import com.vt.kotlinexamples.retrofit_network.network.model.appupdate.AppUpdateResp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CommonViewModel private constructor(private val context: Context) {
    // Follow below structure for creating API calls
    // App Update Section
    val appUpdateRespMutableLiveData = MutableLiveData<AppUpdateResp?>()

    fun getAppUpdate(osType: String?) {
        try {
            val apiService = getInstance().create(
                ApiService::class.java
            )
            val mCall = apiService.getAppUpdate(osType)
            mCall!!.enqueue(object : Callback<AppUpdateResp?> {
                override fun onResponse(
                    call: Call<AppUpdateResp?>,
                    response: Response<AppUpdateResp?>
                ) {
                    try {
                        if (response.isSuccessful) {
                            val obj = response.body()
                            appUpdateRespMutableLiveData.setValue(obj)
                        } else {
                            val gson = Gson()
                            val type = object : TypeToken<AppUpdateResp?>() {}.type
                            var errorResponse: AppUpdateResp? = null
                            try {
                                errorResponse = gson.fromJson(response.errorBody()!!.string(), type)
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                            appUpdateRespMutableLiveData.setValue(errorResponse)
                        }
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }

                override fun onFailure(call: Call<AppUpdateResp?>, t: Throwable) {
                    Toast.makeText(context, "something went wrong", Toast.LENGTH_LONG).show()
                    appUpdateRespMutableLiveData.value = null
                }
            })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    } // App Update Section

    companion object {
        private var sInstance: CommonViewModel? = null
        @Synchronized
        fun getInstance(context: Context): CommonViewModel? {
            if (sInstance == null) {
                sInstance = CommonViewModel(context)
            }
            return sInstance
        }
    }
}