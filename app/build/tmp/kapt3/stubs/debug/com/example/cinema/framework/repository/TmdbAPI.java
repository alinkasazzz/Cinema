package com.example.cinema.framework.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/cinema/framework/repository/TmdbAPI;", "", "getMovies", "Lretrofit2/Call;", "Lcom/example/cinema/framework/repository/MoviesResponse;", "category", "", "apiKey", "language", "page", "", "app_debug"})
public abstract interface TmdbAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{category}")
    public abstract retrofit2.Call<com.example.cinema.framework.repository.MoviesResponse> getMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page);
}