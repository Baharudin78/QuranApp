package com.baharudin.quranapp.domain.repository

import com.baharudin.quranapp.domain.model.Surah
import com.baharudin.quranapp.domain.model.SurahDetail
import com.baharudin.quranapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface QuranRepository {
    suspend fun getAllSurah() : Flow<Resource<List<Surah>>>

    suspend fun getSurahByName(number : Int) : Flow<Resource<SurahDetail>>
}