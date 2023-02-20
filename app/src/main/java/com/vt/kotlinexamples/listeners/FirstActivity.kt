package com.vt.kotlinexamples.listeners

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = object : MyListener {
            override fun onEventOccurred(data: String) {
                // Handle the event here
                Log.e("LOG",data)
            }
        }

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("listener", listener)
        startActivity(intent)
    }
}
