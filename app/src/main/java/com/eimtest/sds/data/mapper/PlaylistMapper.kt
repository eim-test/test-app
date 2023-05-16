package com.eimtest.sds.data.mapper

import com.eimtest.sds.data.remote.dto.PlaylistDto
import com.eimtest.sds.domain.model.Playlist
import com.eimtest.sds.domain.usecase.GetInitialsText

fun PlaylistDto.toPlaylist(): Playlist {
    return Playlist(
        id = id ?: 0,
        initialsName = GetInitialsText().invoke(name),
        bgm = bgm ?: "",
        image = image ?: ""
    )
}