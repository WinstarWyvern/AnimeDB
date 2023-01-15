package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeStat {
    @SerializedName("days_watched")
    @Expose
    private Double daysWatched;
    @SerializedName("mean_score")
    @Expose
    private Double meanScore;
    @SerializedName("watching")
    @Expose
    private Integer watching;
    @SerializedName("completed")
    @Expose
    private Integer completed;
    @SerializedName("on_hold")
    @Expose
    private Integer onHold;
    @SerializedName("dropped")
    @Expose
    private Integer dropped;
    @SerializedName("plan_to_watch")
    @Expose
    private Integer planToWatch;
    @SerializedName("total_entries")
    @Expose
    private Integer totalEntries;
    @SerializedName("rewatched")
    @Expose
    private Integer rewatched;
    @SerializedName("episodes_watched")
    @Expose
    private Integer episodesWatched;

    public Double getDaysWatched() {
        return daysWatched;
    }

    public void setDaysWatched(Double daysWatched) {
        this.daysWatched = daysWatched;
    }

    public Double getMeanScore() {
        return meanScore;
    }

    public void setMeanScore(Double meanScore) {
        this.meanScore = meanScore;
    }

    public Integer getWatching() {
        return watching;
    }

    public void setWatching(Integer watching) {
        this.watching = watching;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Integer getOnHold() {
        return onHold;
    }

    public void setOnHold(Integer onHold) {
        this.onHold = onHold;
    }

    public Integer getDropped() {
        return dropped;
    }

    public void setDropped(Integer dropped) {
        this.dropped = dropped;
    }

    public Integer getPlanToWatch() {
        return planToWatch;
    }

    public void setPlanToWatch(Integer planToWatch) {
        this.planToWatch = planToWatch;
    }

    public Integer getTotalEntries() {
        return totalEntries;
    }

    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }

    public Integer getRewatched() {
        return rewatched;
    }

    public void setRewatched(Integer rewatched) {
        this.rewatched = rewatched;
    }

    public Integer getEpisodesWatched() {
        return episodesWatched;
    }

    public void setEpisodesWatched(Integer episodesWatched) {
        this.episodesWatched = episodesWatched;
    }

}
