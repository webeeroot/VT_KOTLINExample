package com.vt.kotlinexamples.retrofit_network

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.R
import com.vt.kotlinexamples.retrofit_network.viewmodel.CommonViewModel

class RetrofitExActivity : AppCompatActivity() {
    var commonViewModel: CommonViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_ex)

        //View model initialization
        commonViewModel = CommonViewModel.getInstance(this)

        //API call of Checking App Updates
        commonViewModel!!.getAppUpdate(getString(R.string.android_text))

        //Get Response for APP Update
        commonViewModel!!.appUpdateRespMutableLiveData.observe(this,
            { appUpdateResp ->
                try {
                    if (appUpdateResp!!.data != null) {

                    } else {

                    }
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            })

    }
}