package com.vt.kotlinexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.vt.kotlinexamples.companion_static.StaticActivity
import com.vt.kotlinexamples.recyclerview.RecyclerViewActivity

class MainActivity : AppCompatActivity(), TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StaticActivity.name
        StaticActivity.newMtthod()

        startActivity(Intent(this, RecyclerViewActivity::class.java))
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged(p0: Editable?) {
        TODO("Not yet implemented")
    }

}