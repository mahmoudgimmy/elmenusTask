package com.example.elmenustask.ui.recipes.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.elmenustask.data.local.RecipesDao

import com.example.elmenustask.data.remote.RecipesRemote
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag
import com.example.elmenustask.ui.recipes.factory.DataSource
import com.example.elmenustask.ui.recipes.pagination.TagsPagingSource
import kotlinx.coroutines.flow.Flow

class RemoteDataSource(
    private val recipesRemote: RecipesRemote,
    private val recipesDao: RecipesDao
) : DataSource() {
    override suspend fun loadTags(): Flow<PagingData<Tag>> = Pager(
        config = PagingConfig(
            pageSize = 10,
            prefetchDistance = 7,
            initialLoadSize = 10
        ),
        pagingSourceFactory = { TagsPagingSource(recipesRemote, recipesDao) }
    ).flow

    override suspend fun loadItems(tagName: String): List<Item> {

        val items = recipesRemote.getItemsPerTag(tagName).items

        items.forEach { item ->
            item.tagName = tagName
            recipesDao.insertItem(item)
        }
        return items
    }

}
