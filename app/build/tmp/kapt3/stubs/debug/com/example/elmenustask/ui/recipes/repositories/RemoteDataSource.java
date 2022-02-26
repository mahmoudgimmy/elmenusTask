package com.example.elmenustask.ui.recipes.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/elmenustask/ui/recipes/repositories/RemoteDataSource;", "Lcom/example/elmenustask/ui/recipes/factory/DataSource;", "elmenusRemote", "Lcom/example/elmenustask/data/remote/ElmenusRemote;", "recipesDao", "Lcom/example/elmenustask/data/local/RecipesDao;", "(Lcom/example/elmenustask/data/remote/ElmenusRemote;Lcom/example/elmenustask/data/local/RecipesDao;)V", "loadItems", "", "Lcom/example/elmenustask/models/Item;", "tagName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTags", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/elmenustask/models/Tag;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataSource extends com.example.elmenustask.ui.recipes.factory.DataSource {
    private final com.example.elmenustask.data.remote.ElmenusRemote elmenusRemote = null;
    private final com.example.elmenustask.data.local.RecipesDao recipesDao = null;
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.elmenustask.data.remote.ElmenusRemote elmenusRemote, @org.jetbrains.annotations.NotNull()
    com.example.elmenustask.data.local.RecipesDao recipesDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadTags(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.elmenustask.models.Tag>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadItems(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.elmenustask.models.Item>> continuation) {
        return null;
    }
}