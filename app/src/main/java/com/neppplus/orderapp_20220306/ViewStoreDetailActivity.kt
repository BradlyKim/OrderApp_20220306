package com.neppplus.orderapp_20220306

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import com.neppplus.orderapp_20220306.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import java.security.Permission

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setValues()
    }

    fun setupEvents(){

        btnCall.setOnClickListener {

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(
                        this@ViewStoreDetailActivity,
                        "통화 권한이 필요합니다.",
                        Toast.LENGTH_SHORT
                    ).show()

                }

            }

            TedPermission.create()
                .setPermissionListener(pl)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }


    }
    fun setValues(){

        txtName.text = mStoreData.name
        Glide.with(this).load(mStoreData.logoUrl).into(imgLogo)
        txtPhoneNum.text = mStoreData.phoneNum
        scoreRatingBar.rating = mStoreData.score.toFloat()
        txtScore.text = "(${mStoreData.score})"

    }
}