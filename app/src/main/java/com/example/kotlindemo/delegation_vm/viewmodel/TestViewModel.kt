package com.example.kotlindemo.delegation_vm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class TestViewModel(
        private val state: SavedStateHandle
) : ViewModel() {

    val data: MutableLiveData<Int> = state.getLiveData<Int>(KEY, DEFAULT)

    fun add() {
        data.value = data.value?.plus(1)
    }

    companion object{
        const val KEY = "key" // 鍵值
        const val DEFAULT = 0 // 初始值
    }

}