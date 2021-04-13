package com.example.cinema.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cinema.databinding.FragmentHomeBinding
import com.example.cinema.framework.IMG_URL
import com.example.cinema.framework.datas.Film
import com.example.cinema.framework.recyclerView.AdapterVertical
import com.squareup.picasso.Picasso

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by lazy { ViewModelProvider(this).get(HomeViewModel::class.java) }
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        homeViewModel.getDataMap().observe(viewLifecycleOwner, {
            setLatest(it)
            createRecycler(it)
        })
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setLatest(map: MutableMap<String, List<Film>>) {
        val path =
            if (map["latest"]?.get(0)?.poster_path == null)
                "${IMG_URL}${map["popular"]?.get(0)?.poster_path}"
            else
                "${IMG_URL}${map["latest"]?.get(0)?.poster_path}"
        val poster: ImageView = binding.latest
        Picasso.get()
            .load(path)
            .into(poster)
    }

    private fun createRecycler(map: MutableMap<String, List<Film>>) {
        // Список блоков
        binding.pageRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterVertical(map)
            setHasFixedSize(true)
        }
    }
}
