package com.example.omdb.local.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.omdb.response.MediaItem

@Dao
interface FavoriteItemDao {



    @Insert
    suspend fun insertFavs(vararg users: MediaItem)




}