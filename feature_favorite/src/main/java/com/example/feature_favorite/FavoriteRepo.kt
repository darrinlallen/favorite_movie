package com.example.feature_favorite

import android.app.Application
import com.example.omdb.local.OmdbDatabase
import com.example.omdb.remote.OmdbService
import com.example.omdb.response.MediaItem
import com.example.omdb.response.SearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

/**
 * Using object makes this instance a Singleton Class, which means only 1 instance of this class will ever exist
 */
class FavoriteRepo(app: Application) {

    private val mediaItemDao by lazy { OmdbDatabase.getInstance(app).mediaItemDao() }

    val mediaItems: Flow<List<MediaItem>> = mediaItemDao.getAll()

    /**
     * suspend -> makes this a coroutine function so we can move its operations to another thread
     * withContext -> part of coroutines we use this to change the Thread
     * Dispatchers -> Use this to select the thread
     *
     * This method uses OMDB Service instance to fetch for media item relating to the query passed in
     */

    }
