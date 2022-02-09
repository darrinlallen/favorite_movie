package com.example.feature_favorite.favoriteviewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, d2 = {"Lcom/example/feature_favorite/favoriteviewmodel/SearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_binding", "Lcom/example/feature_favorite/databinding/FragmentFavoriteBinding;", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/feature_search/util/ViewState;", "binding", "getBinding", "()Lcom/example/feature_favorite/databinding/FragmentFavoriteBinding;", "omdbRepo", "Lcom/example/omdb/OmdbRepo;", "getOmdbRepo", "()Lcom/example/omdb/OmdbRepo;", "omdbRepo$delegate", "Lkotlin/Lazy;", "value", "", "query", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "searchForMediaItems", "", "feature_favorite_debug"})
public final class SearchViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.feature_favorite.databinding.FragmentFavoriteBinding _binding;
    private final kotlin.Lazy omdbRepo$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.feature_search.util.ViewState> _viewState = null;
    
    /**
     * Holds query being searched
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String query = "";
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    private final com.example.feature_favorite.databinding.FragmentFavoriteBinding getBinding() {
        return null;
    }
    
    private final com.example.omdb.OmdbRepo getOmdbRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.feature_search.util.ViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    private final void searchForMediaItems(java.lang.String query) {
    }
}