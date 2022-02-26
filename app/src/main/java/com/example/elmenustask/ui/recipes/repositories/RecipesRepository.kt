package com.example.elmenustask.ui.recipes.repositories

import androidx.paging.PagingData
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag
import com.example.elmenustask.ui.recipes.factory.DataSourceFactory
import com.example.elmenustask.ui.recipes.viewmodels.Mode
import kotlinx.coroutines.flow.Flow

class RecipesRepository(private val dataSourceFactory: DataSourceFactory, private val mode: Mode) :
    IRecipesRepo {
    override suspend fun getTags(): Flow<PagingData<Tag>> =
        dataSourceFactory.getDataSource(mode).loadTags()


    override suspend fun getItems(tagName: String): List<Item> =
        dataSourceFactory.getDataSource(mode).loadItems(tagName)

}