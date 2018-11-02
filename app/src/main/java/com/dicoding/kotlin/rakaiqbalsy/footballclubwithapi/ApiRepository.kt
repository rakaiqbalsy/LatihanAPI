package com.dicoding.kotlin.rakaiqbalsy.footballclubwithapi

import java.net.URL

class ApiRepository {
    fun doRequest(url:String) : String {
        return URL(url).readText()
    }
}