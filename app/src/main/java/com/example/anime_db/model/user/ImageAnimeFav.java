package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageAnimeFav {
    @SerializedName("jpg")
    @Expose
    private JpgAnimeFav jpg;
    @SerializedName("webp")
    @Expose
    private WebpAnimeFav webp;

    public JpgAnimeFav getJpg() {
        return jpg;
    }

    public void setJpg(JpgAnimeFav jpg) {
        this.jpg = jpg;
    }

    public WebpAnimeFav getWebp() {
        return webp;
    }

    public void setWebp(WebpAnimeFav webp) {
        this.webp = webp;
    }
}
