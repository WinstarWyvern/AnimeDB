package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {
    @SerializedName("jpg")
    @Expose
    private Jpg jpg;
    @SerializedName("webp")
    @Expose
    private Webp webp;

    public Jpg getJpg() {
        return jpg;
    }

    public void setJpg(Jpg jpg) {
        this.jpg = jpg;
    }

    public Webp getWebp() {
        return webp;
    }

    public void setWebp(Webp webp) {
        this.webp = webp;
    }
}
