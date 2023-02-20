package com.vt.kotlinexamples.listeners

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.R
import com.vt.kotlinexamples.databinding.FragmentFirstBinding

class SecondActivity : AppCompatActivity() {
    private var listener: MyListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)

        listener = intent.getSerializableExtra("listener") as MyListener?

        val next = findViewById<Button>(R.id.button_first)
        // Trigger the event when needed
        next.setOnClickListener {
            listener?.onEventOccurred("Some data")
            finish()
        }
    }
}
