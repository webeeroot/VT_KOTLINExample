package com.vt.kotlinexamples.listeners

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.MyApp
import com.vt.kotlinexamples.R
import com.vt.kotlinexamples.databinding.FragmentFirstBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)

        val myApp = applicationContext as MyApp

        val next = findViewById<Button>(R.id.button_first)
        // Trigger the event when needed
        next.setOnClickListener {
            myApp.myListener!!.onEventOccurred("Some data")
            finish()
        }
    }
}
