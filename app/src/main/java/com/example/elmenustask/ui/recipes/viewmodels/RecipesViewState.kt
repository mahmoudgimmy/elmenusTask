package com.example.elmenustask.ui.recipes.viewmodels

import androidx.paging.PagingData
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag

sealed class RecipesViewState {
    object LOADING : RecipesViewState()
    class Tags(val payload: PagingData<Tag> = PagingData.empty()) : RecipesViewState()
    class Items(val payload: List<Item>) : RecipesViewState()
    class FAILURE(val errorMsg: String) : RecipesViewState()
}

sealed class Mode {
    object ONLINE : Mode()
    object OFFLINE : Mode()
}