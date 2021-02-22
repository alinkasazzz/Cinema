package com.example.cinema.framework.datas

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NowPlaying(val results: List<Film>)