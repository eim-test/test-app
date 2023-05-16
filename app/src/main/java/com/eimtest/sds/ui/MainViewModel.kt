package com.eimtest.sds.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eimtest.sds.domain.usecase.GetPlaylist
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getPlaylistUseCase: GetPlaylist
) : ViewModel() {

    var state = MutableStateFlow(MainState())
        private set

    fun getPlaylist() {
        viewModelScope.launch {
            state.update {
                it.copy(isLoading = true)
            }
            getPlaylistUseCase()
                .onSuccess { playlists ->
                    state.update {
                        it.copy(
                            isLoading = false,
                            playlists = playlists
                        )
                    }
                }
                .onFailure {
                    state.update {
                        it.copy(isLoading = false)
                    }
                }
        }
    }
}