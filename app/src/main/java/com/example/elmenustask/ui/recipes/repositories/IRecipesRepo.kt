package com.example.elmenustask.ui.recipes.repositories

import androidx.paging.PagingData
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Items
import com.example.elmenustask.models.Tag
import kotlinx.coroutines.flow.Flow


interface IRecipesRepo {
    suspend fun getTags(): Flow<PagingData<Tag>>
    suspend fun getItems(tagName: String): List<Item>
}