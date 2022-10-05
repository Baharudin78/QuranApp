package com.baharudin.quranapp.data.mapper

import com.baharudin.quranapp.data.remote.dto.SurahDetailDto
import com.baharudin.quranapp.data.remote.dto.SurahDto
import com.baharudin.quranapp.domain.model.Surah
import com.baharudin.quranapp.domain.model.SurahDetail


fun SurahDto.toSurah() : Surah {
    return Surah(
        number = number,
        numberOfAyahs = numberOfAyahs,
        name = name,
        translation = translation,
        revelation = revelation,
        description = description,
        audio = audio
    )
}

fun Surah.toSurahDto() : SurahDto {
    return SurahDto(
        number = number,
        numberOfAyahs = numberOfAyahs,
        name = name,
        translation = translation,
        revelation = revelation,
        description = description,
        audio = audio
    )
}

fun SurahDetailDto.toSurahDetail() : SurahDetail {
    return SurahDetail(
        audio = audio,
        ayahs = ayahs,
        description = description,
        name = name,
        number = number,
        numberOfAyahs = numberOfAyahs,
        revelation = revelation,
        translation = translation
    )
}

fun SurahDetail.toSurahDetailDto() : SurahDetailDto {
    return SurahDetailDto(
        audio = audio,
        ayahs = ayahs,
        description = description,
        name = name,
        number = number,
        numberOfAyahs = numberOfAyahs,
        revelation = revelation,
        translation = translation
    )
}