package com.example.cinema.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cinema.framework.datas.CurrentFilm

class MovieViewModel(): ViewModel(){
    private val _data: MutableLiveData<CurrentFilm> = MutableLiveData<CurrentFilm>().apply {
    }
    val data:LiveData<CurrentFilm> = _data

}

