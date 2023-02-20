package com.vt.kotlinexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.vt.kotlinexamples.companion_static.StaticActivity
import com.vt.kotlinexamples.recyclerview.RecyclerViewActivity

class MainActivity : AppCompatActivity(), TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DBAnameTIL = findViewById<TextInputLayout>(R.id.DBAnameTIL)
        val DBAnameET = findViewById<TextInputEditText>(R.id.DBAnameET)
//        StaticActivity.name
//        StaticActivity.newMtthod()
//
//        startActivity(Intent(this, RecyclerViewActivity::class.java))

//        Utils.setUpperHintColor(DBAnameTIL, getColor(R.color.error_red))

        DBAnameET.setOnFocusChangeListener { view, b ->
            if (b) {
                Utils.setUpperHintColor(DBAnameTIL, getColor(R.color.error_red))
            }
        }
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