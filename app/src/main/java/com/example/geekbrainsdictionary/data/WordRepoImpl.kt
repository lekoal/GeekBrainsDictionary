package com.example.geekbrainsdictionary.data

import com.example.geekbrainsdictionary.data.web.entity.SearchResultDTO
import com.example.geekbrainsdictionary.domain.WordRepo
import io.reactivex.rxjava3.core.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WordRepoImpl : WordRepo {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://dictionary.skyeng.ru/api/")
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api: SkyengApi = retrofit.create(SkyengApi::class.java)

    override fun getResultList(searchWord: String): Single<List<SearchResultDTO>> {
        return api.search(searchWord)
    }


}