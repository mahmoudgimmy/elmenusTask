package com.example.elmenustask.ui.recipes.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/Mode;", "", "()V", "OFFLINE", "ONLINE", "Lcom/example/elmenustask/ui/recipes/viewmodels/Mode$ONLINE;", "Lcom/example/elmenustask/ui/recipes/viewmodels/Mode$OFFLINE;", "app_debug"})
public abstract class Mode {
    
    private Mode() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/Mode$ONLINE;", "Lcom/example/elmenustask/ui/recipes/viewmodels/Mode;", "()V", "app_debug"})
    public static final class ONLINE extends com.example.elmenustask.ui.recipes.viewmodels.Mode {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.elmenustask.ui.recipes.viewmodels.Mode.ONLINE INSTANCE = null;
        
        private ONLINE() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/elmenustask/ui/recipes/viewmodels/Mode$OFFLINE;", "Lcom/example/elmenustask/ui/recipes/viewmodels/Mode;", "()V", "app_debug"})
    public static final class OFFLINE extends com.example.elmenustask.ui.recipes.viewmodels.Mode {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.elmenustask.ui.recipes.viewmodels.Mode.OFFLINE INSTANCE = null;
        
        private OFFLINE() {
            super();
        }
    }
}