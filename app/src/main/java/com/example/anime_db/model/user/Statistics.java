package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistics {
    @SerializedName("anime")
    @Expose
    private AnimeStat anime;
    @SerializedName("manga")
    @Expose
    private MangaStat manga;

    public AnimeStat getAnime() {
        return anime;
    }

    public void setAnime(AnimeStat anime) {
        this.anime = anime;
    }

    public MangaStat getManga() {
        return manga;
    }

    public void setManga(MangaStat manga) {
        this.manga = manga;
    }
}
