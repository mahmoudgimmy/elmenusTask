package com.example.elmenustask.ui.recipes.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.elmenustask.ui.recipes.repositories.IRecipesRepo
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class RecipesViewModel(private val repository: IRecipesRepo) : ViewModel() {
    private val _viewState = MutableLiveData<RecipesViewState>()
    val viewState: LiveData<RecipesViewState> = _viewState
    fun loadTags() =
        viewModelScope.launch {
            try {
                repository.getTags().onEach {
                    _viewState.value = RecipesViewState.LOADING

                }
                    .cachedIn(viewModelScope).collectLatest {
                        _viewState.value = RecipesViewState.Tags(payload = it)
                    }
            } catch (e: Exception) {
                _viewState.value = RecipesViewState.FAILURE(errorMsg = e.message!!)

            }

        }

    fun loadItems(tagName: String) = viewModelScope.launch {
        try {
            _viewState.value = RecipesViewState.LOADING

            val result = repository.getItems(tagName)
            _viewState.value = RecipesViewState.Items(payload = result)
        } catch (e: Exception) {
            _viewState.value = RecipesViewState.FAILURE(errorMsg = e.message!!)

        }

    }
}