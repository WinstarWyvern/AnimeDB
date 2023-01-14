package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageEntry {
    @SerializedName("jpg")
    @Expose
    private JpgEntry jpg;
    @SerializedName("webp")
    @Expose
    private WebpEntry webp;

    public JpgEntry getJpg() {
        return jpg;
    }

    public void setJpg(JpgEntry jpg) {
        this.jpg = jpg;
    }

    public WebpEntry getWebp() {
        return webp;
    }

    public void setWebp(WebpEntry webp) {
        this.webp = webp;
    }
}
