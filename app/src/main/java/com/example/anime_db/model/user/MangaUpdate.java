package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MangaUpdate {
    @SerializedName("entry")
    @Expose
    private EntryManga entry;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("chapters_read")
    @Expose
    private Integer chaptersRead;
    @SerializedName("chapters_total")
    @Expose
    private Integer chaptersTotal;
    @SerializedName("date")
    @Expose
    private String date;

    public EntryManga getEntry() {
        return entry;
    }

    public void setEntry(EntryManga entry) {
        this.entry = entry;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getChaptersRead() {
        return chaptersRead;
    }

    public void setChaptersRead(Integer chaptersRead) {
        this.chaptersRead = chaptersRead;
    }

    public Integer getChaptersTotal() {
        return chaptersTotal;
    }

    public void setChaptersTotal(Integer chaptersTotal) {
        this.chaptersTotal = chaptersTotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
