package com.eimtest.sds.data.remote

import com.eimtest.sds.data.remote.dto.PlaylistResponse
import retrofit2.http.GET

interface ApiService {

    @GET("api/playlist")
    suspend fun getPlaylist(): PlaylistResponse
}