package com.example.kotlindemo.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.lifecycle.LifecycleService
import com.example.kotlindemo.TAG

class MyService : Service() {

    init {
        Log.e(TAG, "Service is running...")
    }



    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val extraStr = intent?.getStringExtra("EXTRA_DATA")
        extraStr?.let {
            Log.e(TAG, it)
        }

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "Service Stopped.")
    }

}