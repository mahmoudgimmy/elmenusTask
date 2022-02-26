package com.example.elmenustask.ui.recipes.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elmenustask/ui/recipes/factory/DataSourceFactory;", "", "recipesDao", "Lcom/example/elmenustask/data/local/RecipesDao;", "elmenusRemote", "Lcom/example/elmenustask/data/remote/ElmenusRemote;", "(Lcom/example/elmenustask/data/local/RecipesDao;Lcom/example/elmenustask/data/remote/ElmenusRemote;)V", "getDataSource", "Lcom/example/elmenustask/ui/recipes/factory/DataSource;", "mode", "Lcom/example/elmenustask/ui/recipes/viewmodels/Mode;", "app_debug"})
public final class DataSourceFactory {
    private final com.example.elmenustask.data.local.RecipesDao recipesDao = null;
    private final com.example.elmenustask.data.remote.ElmenusRemote elmenusRemote = null;
    
    public DataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.example.elmenustask.data.local.RecipesDao recipesDao, @org.jetbrains.annotations.NotNull()
    com.example.elmenustask.data.remote.ElmenusRemote elmenusRemote) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.elmenustask.ui.recipes.factory.DataSource getDataSource(@org.jetbrains.annotations.NotNull()
    com.example.elmenustask.ui.recipes.viewmodels.Mode mode) {
        return null;
    }
}