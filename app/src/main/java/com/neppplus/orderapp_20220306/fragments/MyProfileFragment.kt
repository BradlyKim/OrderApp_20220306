package com.neppplus.orderapp_20220306.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.orderapp_20220306.EditNickNameActivity
import com.neppplus.orderapp_20220306.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_CODE_NICKNAME = 3000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnEditNickName.setOnClickListener {

            val myIntent = Intent(requireContext(), EditNickNameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_CODE_NICKNAME) {

            if(resultCode == Activity.RESULT_OK) {

                val resultNickname = data!!.getStringExtra("nickname")
                txtNickName.text = resultNickname

            }

        }

    }

}