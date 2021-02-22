package com.example.cinema.framework.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.R
import com.example.cinema.framework.datas.LatestPOJO
import com.google.android.material.textview.MaterialTextView

class AdapterVertical(private val data: LatestPOJO): RecyclerView.Adapter<AdapterVertical.Holder>() {
    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var header: MaterialTextView = itemView.findViewById(R.id.header)
        val recyclerInner:RecyclerView = itemView.findViewById(R.id.recycler_inner)
    }

    private val blocks = 4

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_home_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        when(position){
            0 -> holder.header.text = "Идут сейчас"
            1 -> holder.header.text = "Популярные"
            2 -> holder.header.text = "Лучшие оценки"
            3 -> holder.header.text = "Ожидаемые"
        }
        holder.recyclerInner.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = AdapterHorizontal(data)
            setHasFixedSize(true)
        }
    }

    override fun getItemCount() = blocks
}
