package com.example.movie_database.utils

import com.example.omdb.response.MediaItem

//state variable
sealed class ViewState {
    object Loading: ViewState()
    data class  Error(val exception: String) : ViewState()
    data class  Success(val movies: MediaItem) : ViewState()
}