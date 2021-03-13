package com.example.androiddevchallenge.application

import android.app.Application
import timber.log.Timber

class WeTradeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}