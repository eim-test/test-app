package com.eimtest.sds.domain.repo

import com.eimtest.sds.data.mapper.toPlaylist
import com.eimtest.sds.data.remote.ApiService
import com.eimtest.sds.data.repo.Repository
import com.eimtest.sds.domain.model.Playlist

class RepositoryImpl(private val api: ApiService) : Repository {

    override suspend fun getPlaylist(): Result<List<Playlist>> {
        return try {
            val data = api.getPlaylist().data.map { it.toPlaylist() }
            Result.success(data)
        } catch (e: Exception) {
            e.printStackTrace()
            Result.failure(e)
        }
    }
}