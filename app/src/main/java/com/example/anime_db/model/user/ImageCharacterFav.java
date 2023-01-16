package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageCharacterFav {
    @SerializedName("jpg")
    @Expose
    private JpgCharacterFav jpg;
    @SerializedName("webp")
    @Expose
    private WebpCharacterFav webp;

    public JpgCharacterFav getJpg() {
        return jpg;
    }

    public void setJpg(JpgCharacterFav jpg) {
        this.jpg = jpg;
    }

    public WebpCharacterFav getWebp() {
        return webp;
    }

    public void setWebp(WebpCharacterFav webp) {
        this.webp = webp;
    }
}
