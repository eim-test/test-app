package com.eimtest.sds.ui

import com.eimtest.sds.domain.model.Playlist


data class MainState(
    val isLoading: Boolean = false,
    val playlists: List<Playlist> = emptyList()
)