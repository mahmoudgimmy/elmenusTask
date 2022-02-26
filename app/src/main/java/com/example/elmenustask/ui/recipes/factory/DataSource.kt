package com.example.elmenustask.ui.recipes.factory

import androidx.paging.PagingData
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag
import kotlinx.coroutines.flow.Flow

abstract class DataSource {
    abstract suspend fun loadTags(): Flow<PagingData<Tag>>
    abstract suspend fun loadItems(tagName: String): List<Item>
}