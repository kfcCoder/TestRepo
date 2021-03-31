package com.example.kotlindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


const val TAG = "qq"

/** 
 * enum class 可以拿來簡單的判斷狀態，但不能傳遞變數；反之，sealed class 可以攜帶變數。
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }








}