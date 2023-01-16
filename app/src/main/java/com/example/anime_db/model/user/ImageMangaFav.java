package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageMangaFav {
    @SerializedName("jpg")
    @Expose
    private JpgMangaFav jpg;
    @SerializedName("webp")
    @Expose
    private WebpMangaFav webp;

    public JpgMangaFav getJpg() {
        return jpg;
    }

    public void setJpg(JpgMangaFav jpg) {
        this.jpg = jpg;
    }

    public WebpMangaFav getWebp() {
        return webp;
    }

    public void setWebp(WebpMangaFav webp) {
        this.webp = webp;
    }
}
