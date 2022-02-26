package com.example.elmenustask.ui.recipes.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/elmenustask/ui/recipes/repositories/IRecipesRepo;", "(Lcom/example/elmenustask/ui/recipes/repositories/IRecipesRepo;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "loadItems", "Lkotlinx/coroutines/Job;", "tagName", "", "loadTags", "app_debug"})
public final class RecipesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.elmenustask.ui.recipes.repositories.IRecipesRepo repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState> viewState = null;
    
    public RecipesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.elmenustask.ui.recipes.repositories.IRecipesRepo repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job loadItems(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName) {
        return null;
    }
}