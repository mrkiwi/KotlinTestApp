package com.test.kotlin.di

import org.koin.android.module.AndroidModule

class AppModule: AndroidModule() {

    override fun context() = applicationContext {

    }
}