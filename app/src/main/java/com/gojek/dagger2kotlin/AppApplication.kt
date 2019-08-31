package com.gojek.dagger2kotlin

import android.app.Application

class AppApplication : Application(){

    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()

    }
}