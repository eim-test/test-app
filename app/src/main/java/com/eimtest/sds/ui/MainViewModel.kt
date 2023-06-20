package com.eimtest.sds.ui

import androidx.lifecycle.ViewModel
import com.eimtest.sds.domain.usecase.GetPlaylist
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getPlaylist: GetPlaylist
) : ViewModel()