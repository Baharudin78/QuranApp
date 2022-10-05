package com.baharudin.quranapp.domain.model

data class SurahDetail(
    val audio: String?,
    val ayahs: List<Ayah?>,
    val description: String?,
    val name: String?,
    val number: Int?,
    val numberOfAyahs: Int?,
    val revelation: String?,
    val translation: String?
)
