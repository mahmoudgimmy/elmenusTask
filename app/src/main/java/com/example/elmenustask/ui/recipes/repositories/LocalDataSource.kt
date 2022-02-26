package com.example.elmenustask.ui.recipes.repositories

import androidx.paging.PagingData
import com.example.elmenustask.data.local.RecipesDao
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag
import com.example.elmenustask.ui.recipes.factory.DataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LocalDataSource(private val recipesDao: RecipesDao) : DataSource() {
    override suspend fun loadTags(): Flow<PagingData<Tag>> =
        flow { emit(PagingData.from(recipesDao.loadAllTags())) }


    override suspend fun loadItems(tagName: String): List<Item> = recipesDao.loadItems(tagName)


}