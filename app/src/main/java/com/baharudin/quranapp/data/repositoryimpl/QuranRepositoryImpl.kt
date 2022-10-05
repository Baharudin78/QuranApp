package com.baharudin.quranapp.data.repositoryimpl

import com.baharudin.quranapp.data.remote.QuranApi
import com.baharudin.quranapp.domain.model.Surah
import com.baharudin.quranapp.domain.model.SurahDetail
import com.baharudin.quranapp.domain.repository.QuranRepository
import com.baharudin.quranapp.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class QuranRepositoryImpl @Inject constructor(
    private val quranApi: QuranApi
) : QuranRepository{
    override suspend fun getAllSurah(): Flow<Resource<List<Surah>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getSurahByName(number: Int): Flow<Resource<SurahDetail>> {
        TODO("Not yet implemented")
    }
}