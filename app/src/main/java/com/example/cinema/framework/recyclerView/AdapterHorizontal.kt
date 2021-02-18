package com.example.cinema.framework.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.R
import com.example.cinema.framework.datas.LatestPOJO
import com.squareup.picasso.Picasso

class AdapterHorizontal(private val data: LatestPOJO) :
    RecyclerView.Adapter<AdapterHorizontal.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val filmImg: ImageView = itemView.findViewById(R.id.film_img)
    }

    private val films = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_home_inner_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
//        Picasso.get().load("https://image.tmdb.org/t/p/w500/${data.results[position].poster_path}").into(holder.filmImg)
    }

    override fun getItemCount() = films/*= data.results.size*/
}