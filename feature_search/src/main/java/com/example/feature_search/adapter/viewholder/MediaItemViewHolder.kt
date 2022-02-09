package com.example.feature_search.adapter.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_search.adapter.MediaItemsAdapter
import com.example.feature_search.databinding.ItemMediaBinding
import com.example.findmymovie.R
import com.example.omdb.response.MediaItem

class MediaItemViewHolder(
    private val binding: ItemMediaBinding,
    private val listener: MediaItemsAdapter.ClickListener
) : RecyclerView.ViewHolder(binding.root) {

    fun bindMediaItem(mediaItem: MediaItem) {
        binding.tvTitle.text = mediaItem.title
        binding.favButton.setOnClickListener(){
        }
        binding.ivPoster.load(mediaItem.poster) {
            scale(Scale.FIT)
            crossfade(true)
            crossfade(500)
            placeholder(R.drawable.no_image)
            transformations(RoundedCornersTransformation(25f))
            build()

        }

        initListner(mediaItem, listener)


    }


    companion object {
        fun newInstance(parent: ViewGroup, listener: MediaItemsAdapter.ClickListener) = ItemMediaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ).let { binding -> MediaItemViewHolder(binding, listener) }
    }
//listner for favorites
        fun initListner(mediaItem: MediaItem, listener: MediaItemsAdapter.ClickListener){
            binding.favButton.setOnClickListener() {
                binding.tvTitle.text = "added to favorites"
                // listener(movieItem)
                listener.itemClicked(mediaItem)

            }
        }


}
