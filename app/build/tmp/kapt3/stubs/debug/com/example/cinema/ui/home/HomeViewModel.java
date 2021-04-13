package com.example.cinema.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R&\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/cinema/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "data", "Landroidx/lifecycle/MutableLiveData;", "", "", "", "Lcom/example/cinema/framework/datas/Film;", "map", "retrofit", "Lcom/example/cinema/framework/repository/TmdbAPI;", "kotlin.jvm.PlatformType", "getRetrofit", "()Lcom/example/cinema/framework/repository/TmdbAPI;", "retrofit$delegate", "Lkotlin/Lazy;", "getDataMap", "Landroidx/lifecycle/LiveData;", "getMovies", "", "category", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>> map = null;
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>>> data = null;
    private final kotlin.Lazy retrofit$delegate = null;
    
    private final com.example.cinema.framework.repository.TmdbAPI getRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.util.List<com.example.cinema.framework.datas.Film>>> getDataMap() {
        return null;
    }
    
    private final void getMovies(java.lang.String category) {
    }
    
    public HomeViewModel() {
        super();
    }
}