package com.example.cinema.framework.datas

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopRated(val results: List<Film>)