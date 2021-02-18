package com.example.cinema.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cinema.framework.datas.MyData

class HomeViewModel : ViewModel() {

    private val _data = MutableLiveData<MyData>().apply {
        value = MyData()
    }
    val data: LiveData<MyData> = _data
}