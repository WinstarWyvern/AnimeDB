package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeUpdate {
    @SerializedName("entry")
    @Expose
    private EntryAnime entry;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("episodes_seen")
    @Expose
    private Integer episodesSeen;
    @SerializedName("episodes_total")
    @Expose
    private Integer episodesTotal;
    @SerializedName("date")
    @Expose
    private String date;

    public EntryAnime getEntry() {
        return entry;
    }

    public void setEntry(EntryAnime entry) {
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

    public Integer getEpisodesSeen() {
        return episodesSeen;
    }

    public void setEpisodesSeen(Integer episodesSeen) {
        this.episodesSeen = episodesSeen;
    }

    public Integer getEpisodesTotal() {
        return episodesTotal;
    }

    public void setEpisodesTotal(Integer episodesTotal) {
        this.episodesTotal = episodesTotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
