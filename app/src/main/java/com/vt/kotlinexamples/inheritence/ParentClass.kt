package com.vt.kotlinexamples.inheritence

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.R

open class ParentClass : AppCompatActivity() {

    var name = "Vinay"
    var phone = 9985244471L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @JvmName("getName1")
    fun getName():String {
        return name;
    }

    @JvmName("getPhone1")
    fun getPhone():Long {
        return phone;
    }
}