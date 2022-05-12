package com.fighting.musicstreamingapp.model

data class PlayerModel(
    private val playMusicList: List<MusicModel> = emptyList(),
    var currentPosition: Int = -1,
    var isWatchingPlayListView: Boolean = true
) {

    // 재생중인지 아닌지
    fun getAdapterModels(): List<MusicModel> {
        return playMusicList.mapIndexed { index, musicModel ->
            // copy : 수정하려는 값만 수정하고 클래스 자체를 새로 만들어줌
            val newItem = musicModel.copy(
                isPlaying = index == currentPosition
            )
            newItem
        }
    }

    fun updateCurrentPosition(musicModel: MusicModel) {
        currentPosition = playMusicList.indexOf(musicModel)
    }

    fun nextMusic(): MusicModel? {
        if (playMusicList.isEmpty()) return null

        currentPosition =
            if ((currentPosition + 1) == playMusicList.size) 0 else currentPosition + 1
        return playMusicList[currentPosition]
    }

    fun prevMusic(): MusicModel? {
        if (playMusicList.isEmpty()) return null

        currentPosition =
            if ((currentPosition - 1) < 0) playMusicList.lastIndex else currentPosition - 1
        return playMusicList[currentPosition]
    }

    fun currentMusicModel(): MusicModel? {
        if (playMusicList.isEmpty()) return null
        return playMusicList[currentPosition]
    }

}