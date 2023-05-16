package com.eimtest.sds.data.repo

import com.eimtest.sds.domain.model.Playlist

interface Repository {
    suspend fun getPlaylist(): Result<List<Playlist>>
}