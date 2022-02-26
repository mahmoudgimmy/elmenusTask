package com.example.elmenustask.ui.recipes.factory

import com.example.elmenustask.data.local.RecipesDao
import com.example.elmenustask.data.remote.RecipesRemote
import com.example.elmenustask.ui.recipes.repositories.LocalDataSource
import com.example.elmenustask.ui.recipes.repositories.RemoteDataSource
import com.example.elmenustask.ui.recipes.viewmodels.Mode

class DataSourceFactory(
    private val recipesDao: RecipesDao,
    private val recipesRemote: RecipesRemote
) {
    fun getDataSource(mode: Mode): DataSource {
        return when (mode) {
            is Mode.ONLINE -> {
                RemoteDataSource(recipesRemote, recipesDao)
            }
            is Mode.OFFLINE -> {
                LocalDataSource(recipesDao)
            }
        }

    }
}