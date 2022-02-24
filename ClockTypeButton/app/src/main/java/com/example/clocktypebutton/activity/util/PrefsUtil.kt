package com.example.clocktypebutton.activity.util

import android.content.Context
import android.content.SharedPreferences

class PrefsUtil(context: Context) {

    companion object {
        const val APP_NAME = "My_Today_Line"
    }

    private val prefs : SharedPreferences = context.getSharedPreferences(APP_NAME, 0)

    fun getString(key : String, defValue : String) : String {
        return prefs.getString(key, defValue).toString()
    }

    fun setString(key : String, input : String) {
        prefs.edit().putString(key, input).apply()
    }
}