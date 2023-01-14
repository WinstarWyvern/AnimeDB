package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryAnime {
    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("images")
    @Expose
    private ImageEntry images;
    @SerializedName("title")
    @Expose
    private String title;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageEntry getImages() {
        return images;
    }

    public void setImages(ImageEntry images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
