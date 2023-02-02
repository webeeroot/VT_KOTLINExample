package com.vt.kotlinexamples.companion_static

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vt.kotlinexamples.R
import com.vt.kotlinexamples.companion_static.StaticActivity

class StaticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static)
    }

    companion object {
        var name = "Vinay"
        var phone = 9985244471L

        fun newMtthod():String {
            return ""
        }
    }
}