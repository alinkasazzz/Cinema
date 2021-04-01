package com.example.cinema.framework.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.R
import com.example.cinema.framework.datas.CurrentFilm
import com.example.cinema.framework.datas.POJO
import com.example.cinema.ui.home.HomeFragmentDirections
import com.squareup.picasso.Picasso

class AdapterHorizontal(
    private val data: POJO,
    private val block: Int,
) : RecyclerView.Adapter<AdapterHorizontal.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val filmImg: ImageView = itemView.findViewById(R.id.film_img)
    }

    private val size =
        when (block) {
            0 -> data.nowPlaying.results.size
            1 -> data.popular.results.size
            2 -> data.topRated.results.size
            3 -> data.upcoming.results.size
            else -> 0
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_home_inner_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val poster: ImageView = holder.filmImg
        when (block) {
            0 -> {
                Picasso
                    .get()
                    .load("${poster.context.getString(R.string.img_URL)}${data.nowPlaying.results[position].poster_path}")
                    .into(poster)
                holder.itemView.setOnClickListener {
                    val film = data.nowPlaying.results[position]
                    Navigation.findNavController(it).navigate(
                        HomeFragmentDirections.actionNavHomeToNavMovie(
                            CurrentFilm(
                                film.title,
                                film.poster_path,
                                film.original_title,
                                film.original_language,
                                film.release_date,
                                film.vote_average,
                                film.vote_count,
                                film.overview
                            )
                        )
                    )
                }
            }

            1 -> {
                Picasso
                    .get()
                    .load("${poster.context.getString(R.string.img_URL)}${data.popular.results[position].poster_path}")
                    .into(poster)
                holder.itemView.setOnClickListener {
                    val film = data.popular.results[position]
                    Navigation.findNavController(it).navigate(
                        HomeFragmentDirections.actionNavHomeToNavMovie(
                            CurrentFilm(
                                film.title,
                                film.poster_path,
                                film.original_title,
                                film.original_language,
                                film.release_date,
                                film.vote_average,
                                film.vote_count,
                                film.overview
                            )
                        )
                    )
                }
            }

            2 -> {
                Picasso
                    .get()
                    .load("${poster.context.getString(R.string.img_URL)}${data.topRated.results[position].poster_path}")
                    .into(poster)
                holder.itemView.setOnClickListener {
                    val film = data.topRated.results[position]
                    Navigation.findNavController(it).navigate(
                        HomeFragmentDirections.actionNavHomeToNavMovie(
                            CurrentFilm(
                                film.title,
                                film.poster_path,
                                film.original_title,
                                film.original_language,
                                film.release_date,
                                film.vote_average,
                                film.vote_count,
                                film.overview
                            )
                        )
                    )
                }
            }


            3 -> {
                Picasso
                    .get()
                    .load("${poster.context.getString(R.string.img_URL)}${data.upcoming.results[position].poster_path}")
                    .into(poster)
                holder.itemView.setOnClickListener {
                    val film = data.upcoming.results[position]
                    Navigation.findNavController(it).navigate(
                        HomeFragmentDirections.actionNavHomeToNavMovie(
                            CurrentFilm(
                                film.title,
                                film.poster_path,
                                film.original_title,
                                film.original_language,
                                film.release_date,
                                film.vote_average,
                                film.vote_count,
                                film.overview
                            )
                        )
                    )
                }
            }
        }
    }

    override fun getItemCount() = size
}