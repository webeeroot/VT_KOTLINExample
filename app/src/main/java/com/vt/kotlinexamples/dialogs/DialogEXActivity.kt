package com.vt.kotlinexamples.dialogs

import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.vt.kotlinexamples.R

class DialogEXActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_exactivity)

        val dialog = TestDialog(this@DialogEXActivity)
        dialog.show()
        dialog.onDialogClickListener = object : OnDialogClickListener {
            override fun onDialogClicked(action: String?, value: Any?) {
                println("action")
                println(action)
            }
        }

    }
}