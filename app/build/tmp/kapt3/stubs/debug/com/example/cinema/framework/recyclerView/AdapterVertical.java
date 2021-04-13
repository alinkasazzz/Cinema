package com.example.cinema.framework.recyclerView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/cinema/framework/recyclerView/AdapterVertical;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cinema/framework/recyclerView/AdapterVertical$Holder;", "map", "", "", "", "Lcom/example/cinema/framework/datas/Film;", "(Ljava/util/Map;)V", "blocks", "", "getItemCount", "initRecyclerInner", "", "holder", "position", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Holder", "app_debug"})
public final class AdapterVertical extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cinema.framework.recyclerView.AdapterVertical.Holder> {
    private final int blocks = 4;
    private final java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>> map = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cinema.framework.recyclerView.AdapterVertical.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cinema.framework.recyclerView.AdapterVertical.Holder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void initRecyclerInner(com.example.cinema.framework.recyclerView.AdapterVertical.Holder holder, int position) {
    }
    
    public AdapterVertical(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>> map) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cinema/framework/recyclerView/AdapterVertical$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/cinema/framework/recyclerView/AdapterVertical;Landroid/view/View;)V", "header", "Lcom/google/android/material/textview/MaterialTextView;", "getHeader", "()Lcom/google/android/material/textview/MaterialTextView;", "setHeader", "(Lcom/google/android/material/textview/MaterialTextView;)V", "recyclerInner", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerInner", "()Landroidx/recyclerview/widget/RecyclerView;", "app_debug"})
    public final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.google.android.material.textview.MaterialTextView header;
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.RecyclerView recyclerInner = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.textview.MaterialTextView getHeader() {
            return null;
        }
        
        public final void setHeader(@org.jetbrains.annotations.NotNull()
        com.google.android.material.textview.MaterialTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRecyclerInner() {
            return null;
        }
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}