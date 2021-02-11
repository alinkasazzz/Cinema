package com.example.cinema.framework.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.R
import com.example.cinema.framework.MyData

class AdapterHorizontal(private val data: MyData) : RecyclerView.Adapter<AdapterHorizontal.Holder>() {
    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val filmImg: ImageView = itemView.findViewById(R.id.film_img)
    }

    private val films = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_home_inner_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.filmImg.setImageResource(data.filmImg)
    }

    override fun getItemCount() = films
}