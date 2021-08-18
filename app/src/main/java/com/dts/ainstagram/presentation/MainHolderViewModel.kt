package com.dts.ainstagram.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainHolderViewModel @Inject constructor(): ViewModel() {

    fun log() {
        Timber.d("Open screen")
    }
}
