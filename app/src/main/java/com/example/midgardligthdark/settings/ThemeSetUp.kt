package com.example.midgardligthdark.settings

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager

object ThemeSetUp {
    fun appyTheme(mode:String?, context: Context){
        if("DARK"==mode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else if("LIGTH" == mode){
            AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_NO))
        }else{
            AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM))
        }
    }

    fun appyTheme(context: Context){
        val defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        val value = defaultSharedPreferences.getString(
            "theme",
            "DEFAULT"
        )
        appyTheme(value,context)
    }

}
