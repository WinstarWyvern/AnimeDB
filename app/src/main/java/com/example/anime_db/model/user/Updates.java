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
    private List<Object> manga = null;

    public List<AnimeUpdate> getAnime() {
        return anime;
    }

    public void setAnime(List<AnimeUpdate> anime) {
        this.anime = anime;
    }

    public List<Object> getManga() {
        return manga;
    }

    public void setManga(List<Object> manga) {
        this.manga = manga;
    }
}
