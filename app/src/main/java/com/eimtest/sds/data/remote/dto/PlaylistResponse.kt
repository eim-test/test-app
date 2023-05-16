package com.eimtest.sds.data.remote.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PlaylistResponse(
    @Expose
    @SerializedName("data")
    val data: List<PlaylistDto>
)