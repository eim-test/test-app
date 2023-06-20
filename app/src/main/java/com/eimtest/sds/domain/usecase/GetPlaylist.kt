package com.eimtest.sds.domain.usecase

import com.eimtest.sds.data.repo.Repository
import javax.inject.Inject

class GetPlaylist @Inject constructor(
    private val repository: Repository
)