package com.baharudin.quranapp.domain.model

data class Surah(
    val number : Int? = null,
    val numberOfAyahs : Int? = null,
    val name : String? = null,
    val translation : String? = null,
    val revelation : String? = null,
    val description : String? = null,
    val audio : String? = null
)
