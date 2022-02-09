package com.example.feature_favorite;

import java.lang.System;

/**
 * Using object makes this instance a Singleton Class, which means only 1 instance of this class will ever exist
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/feature_favorite/FavoriteRepo;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mediaItemDao", "Lcom/example/omdb/local/dao/MediaItemDao;", "getMediaItemDao", "()Lcom/example/omdb/local/dao/MediaItemDao;", "mediaItemDao$delegate", "Lkotlin/Lazy;", "mediaItems", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/omdb/response/MediaItem;", "getMediaItems", "()Lkotlinx/coroutines/flow/Flow;", "feature_favorite_debug"})
public final class FavoriteRepo {
    private final kotlin.Lazy mediaItemDao$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.MediaItem>> mediaItems = null;
    
    public FavoriteRepo(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
    
    private final com.example.omdb.local.dao.MediaItemDao getMediaItemDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.MediaItem>> getMediaItems() {
        return null;
    }
}