package com.example.cinema.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cinema.BuildConfig
import com.example.cinema.framework.datas.LatestPOJO
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.Request

class HomeViewModel(private val liveDataToObserve: MutableLiveData<Any> = MutableLiveData()) : ViewModel() {

    init {
        getLatest()
    }

    fun getLiveData() = liveDataToObserve

    private fun getJsonData(json: String): Any {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(LatestPOJO::class.java)
        return adapter.fromJson(json)!!
    }

    private fun getLatest() {
        val apiKey = BuildConfig.API_KEY_V3
        val language = "ru"
        Thread {
            val client = OkHttpClient()
            val request = Request.Builder()
                .get()
                .url("https://api.themoviedb.org/3/movie/latest?api_key=$apiKey&language=$language&page=1")
                .build()
            val response = client.newCall(request).execute()
            liveDataToObserve.postValue(getJsonData(response.body!!.string()))
        }.start()
    }

}