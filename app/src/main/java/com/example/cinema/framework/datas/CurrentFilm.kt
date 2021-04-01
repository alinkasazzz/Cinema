package com.example.cinema.framework.datas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class CurrentFilm(
    val title: String,
    val poster_path: String,
    val original_title: String,
    val original_language: String,
    val release_date: String,
    val vote_average: Double,
    val vote_count: Int,
    val overview: String
) : Parcelable