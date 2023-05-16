package com.eimtest.sds.domain.usecase

import com.eimtest.sds.data.repo.Repository
import com.eimtest.sds.domain.model.Playlist
import javax.inject.Inject

class GetPlaylist @Inject constructor(
    private val repository: Repository
) {

    suspend operator fun invoke(): Result<List<Playlist>> {
        return repository.getPlaylist()
    }
}