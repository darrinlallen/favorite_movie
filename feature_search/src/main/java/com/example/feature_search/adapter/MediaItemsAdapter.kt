package com.example.feature_search.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.feature_search.adapter.viewholder.MediaItemViewHolder
import com.example.feature_search.databinding.ItemMediaBinding
import com.example.omdb.response.MediaItem

class MediaItemsAdapter : ListAdapter<MediaItem, MediaItemViewHolder>(diffUtilItemCallback) {
    private var _binding: ItemMediaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = MediaItemViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: MediaItemViewHolder, position: Int) {
        holder.bindMediaItem(getItem(position))
    }

    companion object {

        private val diffUtilItemCallback = object : DiffUtil.ItemCallback<MediaItem>() {
            override fun areItemsTheSame(
                oldItem: MediaItem, newItem: MediaItem
            ) = oldItem.imdbID == newItem.imdbID

            override fun areContentsTheSame(
                oldItem: MediaItem, newItem: MediaItem
            ) = oldItem == newItem
        }
    }

}
