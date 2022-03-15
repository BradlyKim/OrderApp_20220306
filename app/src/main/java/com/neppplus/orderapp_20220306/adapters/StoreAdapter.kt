package com.neppplus.orderapp_20220306.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.neppplus.orderapp_20220306.R
import com.neppplus.orderapp_20220306.datas.StoreData
import com.willy.ratingbar.BaseRatingBar

class StoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val scoreRatingBar = row.findViewById<BaseRatingBar>(R.id.scoreRatingBar)

        txtName.text = data.name

        Glide.with(mContext).load(data.logoUrl).into(imgLogo)

        scoreRatingBar.rating = data.score.toFloat()


        return row

    }

}