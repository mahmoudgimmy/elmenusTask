package com.example.elmenustask.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/elmenustask/data/remote/ElmenusRemote;", "", "getItemsPerTag", "Lcom/example/elmenustask/models/Items;", "tagName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTags", "Lcom/example/elmenustask/models/Tags;", "pageNumber", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ElmenusRemote {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tags/{page}")
    public abstract java.lang.Object getTags(@retrofit2.http.Path(value = "page")
    int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elmenustask.models.Tags> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "items/{tagName}")
    public abstract java.lang.Object getItemsPerTag(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "tagName")
    java.lang.String tagName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.elmenustask.models.Items> continuation);
}