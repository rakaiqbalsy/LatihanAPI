package com.dicoding.kotlin.rakaiqbalsy.footballclubwithapi

import com.google.gson.annotations.SerializedName

class Club {
    @SerializedName("idTeam")
    var clubId: String? = null

    @SerializedName("strTeam")
    var teamName: String? = null

    @SerializedName("strTeamBagde")
    var teamBadge: String? = null
}