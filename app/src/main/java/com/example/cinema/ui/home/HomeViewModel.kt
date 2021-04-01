package com.example.cinema.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cinema.BuildConfig
import com.example.cinema.framework.datas.POJO
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.Request

class HomeViewModel : ViewModel() {

    private val _data: MutableLiveData<POJO> = MutableLiveData()
    val data: LiveData<POJO> = _data

    init {
        buildPOJO(_data)
    }

    private inline fun <reified T> getJsonData(json: String): T {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(T::class.java)
        return adapter.fromJson(json)!!
    }

    private fun buildPOJO(data: MutableLiveData<POJO>) {
        Thread {
            data.postValue(
                POJO(
                    getJsonData(getData("/movie/now_playing")),
                    getJsonData(getData("/movie/popular")),
                    getJsonData(getData("/movie/top_rated")),
                    getJsonData(getData("/movie/upcoming"))
                )
            )
        }.start()
    }

    private fun getData(get: String): String {
        val apiKey = BuildConfig.API_KEY_V3
        val language = "ru"
        val client = OkHttpClient()
        val request = Request.Builder()
            .get()
            .url("https://api.themoviedb.org/3$get?api_key=$apiKey&language=$language&page=1")
            .build()
        return client.newCall(request).execute().body!!.string()
    }
}