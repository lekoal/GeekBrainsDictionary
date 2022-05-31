package com.example.geekbrainsdictionary.view

import com.example.geekbrainsdictionary.data.web.entity.SearchResultDTO

interface BaseView {
    fun setSearchResult(searchResult: List<SearchResultDTO>)
}