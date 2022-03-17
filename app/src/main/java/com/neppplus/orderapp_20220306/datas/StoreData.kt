package com.neppplus.orderapp_20220306.datas

import java.io.Serializable

class StoreData(
    val name: String,
    val score: Double,
    val phoneNum: String,
    val logoUrl: String,
) : Serializable {
}