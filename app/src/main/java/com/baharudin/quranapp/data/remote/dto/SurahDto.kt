package com.baharudin.quranapp.data.remote.dto

data class SurahDto(
    val number : Int? = null,
    val numberOfAyahs : Int? = null,
    val name : String? = null,
    val translation : String? = null,
    val revelation : String? = null,
    val description : String? = null,
    val audio : String? = null
)
