package com.example.cinema.framework.datas

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PopularPOJO (val results: List<Film>)