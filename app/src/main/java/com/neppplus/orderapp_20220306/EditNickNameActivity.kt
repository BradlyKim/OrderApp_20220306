package com.neppplus.orderapp_20220306

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

        btnSave.setOnClickListener {

            val inputNickname = edtNickName.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNickname)
            setResult(RESULT_OK, resultIntent)
            finish()

        }

    }

    fun setValues() {

    }
}