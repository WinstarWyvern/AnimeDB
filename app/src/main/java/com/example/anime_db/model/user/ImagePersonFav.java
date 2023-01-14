package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagePersonFav {
    @SerializedName("jpg")
    @Expose
    private JpgPersonFav jpg;

    public JpgPersonFav getJpg() {
        return jpg;
    }

    public void setJpg(JpgPersonFav jpg) {
        this.jpg = jpg;
    }
}
