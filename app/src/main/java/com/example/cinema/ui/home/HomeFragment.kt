package com.example.cinema.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cinema.databinding.FragmentHomeBinding
import com.example.cinema.framework.datas.MyData
import com.example.cinema.framework.recyclerView.AdapterVertical

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeViewModel.data.observe(viewLifecycleOwner, {
            createRecycler(it)
        })
        return binding.root
    }

    private fun createRecycler(data: MyData) {
        // Список блоков
        binding.pageRecycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterVertical(data)
            setHasFixedSize(true)
        }
    }
}