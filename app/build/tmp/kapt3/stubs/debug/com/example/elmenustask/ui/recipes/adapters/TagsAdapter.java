package com.example.elmenustask.ui.recipes.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/elmenustask/ui/recipes/adapters/TagsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/elmenustask/models/Tag;", "Lcom/example/elmenustask/ui/recipes/adapters/TagsAdapter$TagViewHolder;", "clickedTag", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TagViewHolder", "app_debug"})
public final class TagsAdapter extends androidx.paging.PagingDataAdapter<com.example.elmenustask.models.Tag, com.example.elmenustask.ui.recipes.adapters.TagsAdapter.TagViewHolder> {
    private final kotlin.jvm.functions.Function1<com.example.elmenustask.models.Tag, kotlin.Unit> clickedTag = null;
    
    public TagsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.elmenustask.models.Tag, kotlin.Unit> clickedTag) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.elmenustask.ui.recipes.adapters.TagsAdapter.TagViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.elmenustask.ui.recipes.adapters.TagsAdapter.TagViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elmenustask/ui/recipes/adapters/TagsAdapter$TagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/elmenustask/databinding/ItemTagBinding;", "(Lcom/example/elmenustask/databinding/ItemTagBinding;)V", "bindTo", "", "tag", "Lcom/example/elmenustask/models/Tag;", "clickedTag", "Lkotlin/Function1;", "app_debug"})
    public static final class TagViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.elmenustask.databinding.ItemTagBinding binding = null;
        
        public TagViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.elmenustask.databinding.ItemTagBinding binding) {
            super(null);
        }
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        com.example.elmenustask.models.Tag tag, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.elmenustask.models.Tag, kotlin.Unit> clickedTag) {
        }
    }
}