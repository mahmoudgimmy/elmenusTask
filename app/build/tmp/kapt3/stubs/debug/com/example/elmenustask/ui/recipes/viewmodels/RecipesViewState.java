package com.example.elmenustask.ui.recipes.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState;", "", "()V", "FAILURE", "Items", "LOADING", "Tags", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$LOADING;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$Tags;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$Items;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$FAILURE;", "app_debug"})
public abstract class RecipesViewState {
    
    private RecipesViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$LOADING;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState;", "()V", "app_debug"})
    public static final class LOADING extends com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState.LOADING INSTANCE = null;
        
        private LOADING() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$Tags;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState;", "payload", "Landroidx/paging/PagingData;", "Lcom/example/elmenustask/models/Tag;", "(Landroidx/paging/PagingData;)V", "getPayload", "()Landroidx/paging/PagingData;", "app_debug"})
    public static final class Tags extends com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState {
        @org.jetbrains.annotations.NotNull()
        private final androidx.paging.PagingData<com.example.elmenustask.models.Tag> payload = null;
        
        public Tags() {
            super();
        }
        
        public Tags(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingData<com.example.elmenustask.models.Tag> payload) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.paging.PagingData<com.example.elmenustask.models.Tag> getPayload() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$Items;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState;", "payload", "", "Lcom/example/elmenustask/models/Item;", "(Ljava/util/List;)V", "getPayload", "()Ljava/util/List;", "app_debug"})
    public static final class Items extends com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.elmenustask.models.Item> payload = null;
        
        public Items(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.elmenustask.models.Item> payload) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.elmenustask.models.Item> getPayload() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState$FAILURE;", "Lcom/example/elmenustask/ui/recipes/viewmodels/RecipesViewState;", "errorMsg", "", "(Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "app_debug"})
    public static final class FAILURE extends com.example.elmenustask.ui.recipes.viewmodels.RecipesViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorMsg = null;
        
        public FAILURE(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMsg) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorMsg() {
            return null;
        }
    }
}