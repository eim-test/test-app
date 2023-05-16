package com.eimtest.sds.data.remote.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlaylistDto(
    @Expose @SerializedName("id") val id: Int?,
    @Expose @SerializedName("name") val name: String,
    @Expose @SerializedName("bgm") val bgm: String?,
    @Expose @SerializedName("image") val image: String?
)