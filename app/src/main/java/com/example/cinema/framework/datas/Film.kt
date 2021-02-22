package com.example.cinema.framework.datas

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Film(val title: String, val original_title: String, val poster_path: String, val overview: String)