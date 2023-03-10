package com.argz.issue4759

import android.app.Application
import com.google.firebase.FirebaseApp

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}