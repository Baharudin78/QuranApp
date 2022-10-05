package com.baharudin.quranapp.data.remote

import com.baharudin.quranapp.data.remote.dto.SurahDetailDto
import com.baharudin.quranapp.data.remote.dto.SurahDto
import retrofit2.http.GET
import retrofit2.http.Path

interface QuranApi {
    @GET("surahs")
    suspend fun getAllSurah() : List<SurahDto>

    @GET("surahs/{number}")
    suspend fun getSurahByName(
        @Path("number") number : Int
    ) : SurahDetailDto
}