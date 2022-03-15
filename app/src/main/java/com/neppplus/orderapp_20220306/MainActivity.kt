package com.neppplus.orderapp_20220306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.orderapp_20220306.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents(){}
    fun setValues(){

        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

//        도전 과제로, 3페이지의 뷰페이저로 구현 예정 => 재사용성 무시, 3장의 화면을 모두 메모리에 유지함.
        mainViewPager.offscreenPageLimit = 3

        mainTabLayout.setupWithViewPager(mainViewPager)

    }
}