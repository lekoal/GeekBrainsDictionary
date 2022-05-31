package com.example.geekbrainsdictionary.data.web.entity

data class MeaningDTO(
    val id: Int,
    val imageUrl: String,
    val partOfSpeechCode: String,
    val previewUrl: String,
    val soundUrl: String,
    val transcription: String,
    val translation: TranslationDTO
)
