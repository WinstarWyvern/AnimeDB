package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageMangaUpdate {
    @SerializedName("jpg")
    @Expose
    private JpgMangaUpdate jpg;
    @SerializedName("webp")
    @Expose
    private WebpMangaUpdate webp;

    public JpgMangaUpdate getJpg() {
        return jpg;
    }

    public void setJpg(JpgMangaUpdate jpg) {
        this.jpg = jpg;
    }

    public WebpMangaUpdate getWebp() {
        return webp;
    }

    public void setWebp(WebpMangaUpdate webp) {
        this.webp = webp;
    }
}
