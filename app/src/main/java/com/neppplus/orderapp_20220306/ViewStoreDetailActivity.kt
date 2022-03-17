package com.neppplus.orderapp_20220306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.orderapp_20220306.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

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



    }
    fun setValues(){

        txtName.text = mStoreData.name
        Glide.with(this).load(mStoreData.logoUrl).into(imgLogo)
        txtPhoneNum.text = mStoreData.phoneNum
        scoreRatingBar.rating = mStoreData.score.toFloat()
        txtScore.text = "(${mStoreData.score})"

    }
}