package com.example.kotlindemo.room.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.kotlindemo.room.db.UserDatabase
import com.example.kotlindemo.room.model.User
import com.example.kotlindemo.room.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = Repository.getInstance(
        UserDatabase.getDatabase(application).getUserDao())

    private val _usersLive = MutableLiveData<List<User>>()

    val userLive: LiveData<List<User>>
        get() = _usersLive

    fun insert(user: User){
        viewModelScope.launch {
            repository.insert(user)
        }
    }

    fun delete(user: User){
        viewModelScope.launch {
            repository.delete(user)
        }
    }

    fun getAllUsersLive() {
        _usersLive.postValue(repository.getAllUsersLive().value)
    }



}