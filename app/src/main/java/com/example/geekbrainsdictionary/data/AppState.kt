package com.example.geekbrainsdictionary.data

import com.example.geekbrainsdictionary.data.web.entity.SearchResultDTO

sealed class AppState {

    data class Success(val data: List<SearchResultDTO>) : AppState()
    data class Error(val error: Throwable) : AppState()
    data class Loading(val progress: Int?) : AppState()

}
