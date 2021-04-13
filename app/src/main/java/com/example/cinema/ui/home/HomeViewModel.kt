package com.example.cinema.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cinema.framework.API_KEY
import com.example.cinema.framework.BASE_URL
import com.example.cinema.framework.datas.Film
import com.example.cinema.framework.repository.MoviesResponse
import com.example.cinema.framework.repository.TmdbAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class HomeViewModel : ViewModel() {

    private val map = mutableMapOf<String, List<Film>>()
    private val data = MutableLiveData<MutableMap<String, List<Film>>>()

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(TmdbAPI::class.java)
    }

    fun getDataMap(): LiveData<MutableMap<String, List<Film>>> {
        getMovies("latest")
        getMovies("now_playing")
        getMovies("popular")
        getMovies("top_rated")
        getMovies("upcoming")
        return data
    }

    private fun getMovies(category: String) {
        val call = retrofit.getMovies(category, API_KEY, "ru", 1)
        call.enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(
                call: Call<MoviesResponse>,
                response: Response<MoviesResponse>
            ) {
                map[category] = response.body()!!.results
                data.postValue(map)
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                Log.e("Ошибка", t.stackTraceToString())
            }
        })
    }
}