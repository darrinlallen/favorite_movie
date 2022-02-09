package com.example.feature_favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.feature_favorite.databinding.FragmentFavoriteBinding
import com.example.feature_favorite.favoriteadapter.fav_Adapter
import com.example.feature_favorite.favoriteviewmodel.favoriteViewModel
import com.example.omdb.response.MediaItem

class FavoriteFragment : Fragment(), fav_Adapter.ClickListener {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<favoriteViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentFavoriteBinding.inflate(inflater, container, false).also {
        _binding = it
    }.root

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun itemClicked(item: MediaItem) {
        TODO("Not yet implemented")
    }

}