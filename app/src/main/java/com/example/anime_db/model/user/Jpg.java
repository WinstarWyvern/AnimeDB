package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jpg {
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
