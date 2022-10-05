package com.baharudin.quranapp.data.mapper

import com.baharudin.quranapp.data.remote.dto.SurahDto
import com.baharudin.quranapp.domain.model.Surah


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