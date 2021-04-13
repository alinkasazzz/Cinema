package com.example.cinema.framework.recyclerView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\'\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ$\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cinema/framework/recyclerView/AdapterHorizontal;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cinema/framework/recyclerView/AdapterHorizontal$Holder;", "map", "", "", "", "Lcom/example/cinema/framework/datas/Film;", "block", "", "(Ljava/util/Map;I)V", "size", "blockActions", "", "holder", "position", "category", "getItemCount", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Holder", "app_debug"})
public final class AdapterHorizontal extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cinema.framework.recyclerView.AdapterHorizontal.Holder> {
    private final int size = 0;
    private final java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>> map = null;
    private final int block = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cinema.framework.recyclerView.AdapterHorizontal.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cinema.framework.recyclerView.AdapterHorizontal.Holder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void blockActions(com.example.cinema.framework.recyclerView.AdapterHorizontal.Holder holder, int position, java.lang.String category) {
    }
    
    public AdapterHorizontal(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>> map, int block) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/cinema/framework/recyclerView/AdapterHorizontal$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/cinema/framework/recyclerView/AdapterHorizontal;Landroid/view/View;)V", "filmImg", "Landroid/widget/ImageView;", "getFilmImg", "()Landroid/widget/ImageView;", "app_debug"})
    public final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView filmImg = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFilmImg() {
            return null;
        }
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}