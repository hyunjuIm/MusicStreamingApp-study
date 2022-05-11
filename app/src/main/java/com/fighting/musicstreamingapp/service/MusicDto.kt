package com.fighting.musicstreamingapp.service

data class MusicDto(
    //Entity : 모델의 실체, 객체 / 서버를 통해 내려온 데이터 그 자체
    val musics: List<MusicEntity>
)