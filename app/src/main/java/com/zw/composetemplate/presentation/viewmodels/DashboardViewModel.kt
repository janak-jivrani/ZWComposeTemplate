package com.zw.composetemplate.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(): ViewModel() {
    private val _initialSataLoad = MutableLiveData<Boolean>()
    val initialSataLoad : LiveData<Boolean> = _initialSataLoad

    fun setLoaded(isLoaded: Boolean) {
        _initialSataLoad.postValue(isLoaded)
    }
}