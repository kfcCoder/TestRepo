package com.example.kotlindemo.room.repository

import com.example.kotlindemo.room.db.UserDao
import com.example.kotlindemo.room.model.User

class Repository(
    private val dao: UserDao
) {

    suspend fun insert(user: User) = dao.insert(user)

    suspend fun delete(user: User) = dao.delete(user)

    fun getAllUsersLive() = dao.getAllUsersLive()

    companion object {
        @Volatile
        private var INSTANCE: Repository? = null

        fun getInstance(dao: UserDao): Repository {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Repository(dao).also { INSTANCE  = it }
            }
        }

    }
}

