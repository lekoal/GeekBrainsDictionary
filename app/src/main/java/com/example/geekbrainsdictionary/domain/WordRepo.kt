package com.example.geekbrainsdictionary.domain

import com.example.geekbrainsdictionary.data.web.entity.SearchResultDTO
import io.reactivex.rxjava3.core.Single

interface WordRepo {
    fun getResultList(searchWord: String): Single<List<SearchResultDTO>>
}