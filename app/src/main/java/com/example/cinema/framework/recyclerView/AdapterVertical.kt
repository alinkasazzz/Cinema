package com.example.cinema.framework.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cinema.R
import com.example.cinema.framework.datas.POJO
import com.google.android.material.textview.MaterialTextView

class AdapterVertical(private val data: POJO) : RecyclerView.Adapter<AdapterVertical.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var header: MaterialTextView = itemView.findViewById(R.id.header)
        val recyclerInner: RecyclerView = itemView.findViewById(R.id.recycler_inner)
    }

    private val blocks = 4

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_home_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val header: MaterialTextView = holder.header
        when (position) {
            0 -> {
                header.text = header.context.getString(R.string.nowPlaying)
                initRecyclerInner(holder, position)
            }

            1 -> {
                header.text = header.context.getString(R.string.popular)
                initRecyclerInner(holder, position)

            }

            2 -> {
                header.text = header.context.getString(R.string.topRated)
                initRecyclerInner(holder, position)
            }

            3 -> {
                header.text = header.context.getString(R.string.upcoming)
                initRecyclerInner(holder, position)
            }
        }
    }

    override fun getItemCount() = blocks

    private fun initRecyclerInner(holder: Holder, position: Int) {
        holder.recyclerInner.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = AdapterHorizontal(data, position)
            setHasFixedSize(true)
        }
    }
}
