package com.example.clocktypebutton.activity.util

import android.app.Application

class MyApplication : Application() {

    companion object {
        lateinit var prefs: PrefsUtil
    }

    override fun onCreate() {
        prefs = PrefsUtil(applicationContext)
        super.onCreate()
    }
}