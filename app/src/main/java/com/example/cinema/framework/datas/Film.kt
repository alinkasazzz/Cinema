package com.example.cinema.framework.datas

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Film(
    val poster_path: String?,
    val title: String?,
    val original_title: String?,
    val original_language: String?,
    val release_date: String?,
    val vote_average: Double?,
    val vote_count: Int?,
    val overview: String?
)