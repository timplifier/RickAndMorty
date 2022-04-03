package com.timplifier.rickandmorty

import android.app.Application
import com.timplifier.rickandmorty.di.networkModule
import com.timplifier.rickandmorty.di.repositoryModule
import com.timplifier.rickandmorty.di.roomModule
import com.timplifier.rickandmorty.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(networkModule, repositoryModule, viewModelModule, roomModule)
        }
    }
}
