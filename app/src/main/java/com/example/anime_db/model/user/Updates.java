package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Updates {
    @SerializedName("anime")
    @Expose
    private List<AnimeUpdate> anime = null;
    @SerializedName("manga")
    @Expose
    private List<MangaUpdate> manga = null;

    public List<AnimeUpdate> getAnime() {
        return anime;
    }

    public void setAnime(List<AnimeUpdate> anime) {
        this.anime = anime;
    }

    public List<MangaUpdate> getManga() {
        return manga;
    }

    public void setManga(List<MangaUpdate> manga) {
        this.manga = manga;
    }
}
