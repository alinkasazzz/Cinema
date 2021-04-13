package com.example.cinema.framework.repository

import com.example.cinema.framework.datas.Film
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoviesResponse(val results: List<Film>)
