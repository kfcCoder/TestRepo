package com.example.kotlindemo.room.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.kotlindemo.room.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("SELECT * FROM user ORDER BY id DESC")
    fun getAllUsersLive(): LiveData<List<User>>
}