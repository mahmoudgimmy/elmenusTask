package com.example.elmenustask.di

import com.example.elmenustask.data.local.RecipesDataBase
import com.example.elmenustask.ui.recipes.factory.DataSourceFactory
import com.example.elmenustask.ui.recipes.repositories.IRecipesRepo
import com.example.elmenustask.ui.recipes.repositories.RecipesRepository
import com.example.elmenustask.ui.recipes.viewmodels.Mode
import com.example.elmenustask.utilities.isOnline
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoriesModule = module {
    single<IRecipesRepo> { RecipesRepository(get(), get()) }
    single { if (isOnline()) Mode.ONLINE else Mode.OFFLINE }
    single { DataSourceFactory(get(), get()) }
    single { RecipesDataBase.getDatabase(androidContext()).RecipesDao() }
}
