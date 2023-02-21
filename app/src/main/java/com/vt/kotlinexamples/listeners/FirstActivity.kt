package com.vt.kotlinexamples.listeners

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.MyApp
import com.vt.kotlinexamples.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myApp = applicationContext as MyApp
        myApp.myListener = object : MyListener {
            override fun onEventOccurred(data: String) {
                // Handle the event here
                Log.e("data", data)
                finish()
            }
        }

        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
