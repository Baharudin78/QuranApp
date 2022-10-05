package com.baharudin.quranapp.data.remote.dto

import com.baharudin.quranapp.domain.model.Ayah

data class SurahDetailDto(
    val audio: String?= null,
    val ayahs: List<Ayah?> = listOf(),
    val description: String? = null,
    val name: String? = null,
    val number: Int? = null,
    val numberOfAyahs: Int? = null,
    val revelation: String? = null,
    val translation: String? = null
)