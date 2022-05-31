package com.example.geekbrainsdictionary.data.web.entity

data class SearchResultDTO(
    val id: Int,
    val meanings: List<MeaningDTO>,
    val text: String
)