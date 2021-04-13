package com.example.cinema.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.cinema.R
import com.example.cinema.databinding.FragmentMovieBinding
import com.example.cinema.framework.ToolBarTitleListener
import com.example.cinema.framework.IMG_URL
import com.squareup.picasso.Picasso

class MovieFragment : Fragment() {
    private val movieViewModel: MovieViewModel by lazy { ViewModelProvider(this).get(MovieViewModel::class.java) }
    private val args by navArgs<MovieFragmentArgs>()
    private val currentFilm by lazy { args.film }
    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        setMovieInfo()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setMovieInfo() {
        (activity as ToolBarTitleListener).updateTitle(currentFilm?.title)
        Picasso
            .get()
            .load("${IMG_URL}${currentFilm?.poster_path}")
            .into(binding.poster)
        binding.originalTitle.text =
            context?.getString(R.string.original_title, currentFilm?.original_title)
        binding.originalLanguage.text =
            context?.getString(R.string.original_language, currentFilm?.original_language)
        binding.releaseDate.text =
            context?.getString(R.string.release_date, currentFilm?.release_date)
        binding.voteAverage.text =
            context?.getString(R.string.vote_average, currentFilm?.vote_average)
        binding.voteCount.text = context?.getString(R.string.vote_count, currentFilm?.vote_count)
        binding.overview.text = currentFilm?.overview
    }
}