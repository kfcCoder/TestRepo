package com.example.kotlindemo.sealed_enum

/**
 * 1.represent a concrete set of 'classes'
 * 2.they can hold instance-specific data
 */
sealed class DownLoadState {
    data class Failed(val msg: String) : DownLoadState()
    data class Success(val msg: String) : DownLoadState()
}

fun main() {
    val data = DownLoadState.Success("data")
    checkDownloadState(data) // data download success
}

fun checkDownloadState(state: DownLoadState) {
    when(state) {
        is DownLoadState.Failed -> { println("${state.msg} download failed") }
        is DownLoadState.Success -> { println("${state.msg} download success") }
    }
}