package com.example.movie_database.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_favorite.databinding.ItemBinding

import com.example.omdb.response.MediaItem
import com.example.omdb.response.SearchResponse

// Adapter to use with recycler view
class fav_Adapter (
// This is the constroctor it takes in a list of search
    private val movies: List<MediaItem>
) : RecyclerView.Adapter<fav_Adapter.MovieViewHolder>() {
    // extends recycler view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieViewHolder.newInstance(parent)

    // display movie at a certian position
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindUrl(movies[position])

    }

    // returns the number of items in the adapter bound to the parent RecyclerView.
    override fun getItemCount() = movies.size

    // describes an item view and metadata about its place within the RecyclerView
    class MovieViewHolder(
        private val binding: ItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bindUrl(movie: MediaItem) {
        binding.textunit.text = movie.title
            //   print movie title to screen
            //           binding.tvMovie.text = movie.Title
// print poster image to screen
 //           Glide.with(itemView)
 //               .load(movie.poster)
 //               .into(binding.imageunit)
        }

        //    called by on create view holder to inflate layout
        companion object {
            fun newInstance(parent: ViewGroup) = ItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ).let { MovieViewHolder(it) }
//
        }
    }
}
