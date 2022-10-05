package com.baharudin.quranapp.domain.model

data class Ayah(
    val arab: String,
    val audio: Audio,
    val image: Image,
    val tafsir: Tafsir,
    val translation: String
)