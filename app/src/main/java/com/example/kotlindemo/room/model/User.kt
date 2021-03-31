package com.example.kotlindemo.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (
        @PrimaryKey(autoGenerate = true) val id: Int,
        val name: String
)