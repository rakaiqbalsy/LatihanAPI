package com.dicoding.kotlin.rakaiqbalsy.footballclubwithapi

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Club>)
}