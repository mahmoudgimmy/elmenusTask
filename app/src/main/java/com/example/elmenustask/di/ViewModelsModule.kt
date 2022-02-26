package com.example.elmenustask.di

import com.example.elmenustask.ui.recipes.viewmodels.RecipesViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { RecipesViewModel(get()) }
}