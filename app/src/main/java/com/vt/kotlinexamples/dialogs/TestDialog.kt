package com.vt.kotlinexamples.dialogs

import android.content.Context
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.vt.kotlinexamples.R
import com.vt.kotlinexamples.databinding.TestDialogBinding

class TestDialog(mContext: Context) : BaseDialog(mContext) {
    private lateinit var binding: TestDialogBinding

    override fun getLayoutId() = R.layout.test_dialog

    override fun initViews() {
        // Initialize the views and add listeners if needed
        binding = TestDialogBinding.bind(findViewById(R.id.root))
        binding.changePwdTV.text = "ABCD"
        binding.changePwdTV.setOnClickListener {
            dismiss()
            onDialogClickListener!!.onDialogClicked("ABCD", "")
        }
    }
}