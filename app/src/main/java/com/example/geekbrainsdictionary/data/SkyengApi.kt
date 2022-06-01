package com.example.geekbrainsdictionary.data

import com.example.geekbrainsdictionary.data.web.entity.SearchResultDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface SkyengApi {
    @GET("public/v1/words/search")
    fun search(@Query("search") searchWord: String): Single<List<SearchResultDTO>>
}