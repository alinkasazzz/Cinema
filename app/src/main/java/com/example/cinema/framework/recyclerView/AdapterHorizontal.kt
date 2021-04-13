package com.example.cinema.framework.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.R
import com.example.cinema.framework.IMG_URL
import com.example.cinema.framework.datas.CurrentFilm
import com.example.cinema.framework.datas.Film
import com.example.cinema.ui.home.HomeFragmentDirections
import com.squareup.picasso.Picasso

class AdapterHorizontal(
    private val map: MutableMap<String, List<Film>>,
    private val block: Int,
) : RecyclerView.Adapter<AdapterHorizontal.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val filmImg: ImageView = itemView.findViewById(R.id.film_img)
    }

    private val size =
        when (block) {
            0 -> map["now_playing"]!!.size
            1 -> map["popular"]!!.size
            2 -> map["top_rated"]!!.size
            3 -> map["upcoming"]!!.size
            else -> 0
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_home_inner_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        when (block) {
            0 -> {
                blockActions(holder, position, "now_playing")
            }

            1 -> {
                blockActions(holder, position, "popular")
            }

            2 -> {
                blockActions(holder, position, "top_rated")
            }

            3 -> {
                blockActions(holder, position, "upcoming")
            }
        }
    }

    override fun getItemCount() = size

    private fun blockActions(holder: Holder, position: Int, category: String) {
        val poster: ImageView = holder.filmImg
        Picasso
            .get()
            .load("${IMG_URL}${map[category]?.get(position)?.poster_path}")
            .into(poster)
        holder.itemView.setOnClickListener {
            val film = map[category]?.get(position)
            Navigation.findNavController(it).navigate(
                HomeFragmentDirections.actionNavHomeToNavMovie(
                    CurrentFilm(
                        film?.title,
                        film?.poster_path,
                        film?.original_title,
                        film?.original_language,
                        film?.release_date,
                        film?.vote_average,
                        film?.vote_count,
                        film?.overview
                    )
                )
            )
        }
    }
}