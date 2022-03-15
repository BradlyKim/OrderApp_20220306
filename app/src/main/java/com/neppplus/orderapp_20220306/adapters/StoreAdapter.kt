package com.neppplus.orderapp_20220306.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.orderapp_20220306.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {



}