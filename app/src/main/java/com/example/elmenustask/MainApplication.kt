package com.example.elmenustask

import android.app.Application
import com.example.elmenustask.data.local.RecipesDataBase
import com.example.elmenustask.di.networkModule
import com.example.elmenustask.di.repositoriesModule
import com.example.elmenustask.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                listOf(
                    networkModule, viewModelsModule, repositoriesModule
                )
            )
        }
        RecipesDataBase.getDatabase(this)

    }
}