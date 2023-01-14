package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MangaStat {
    @SerializedName("days_read")
    @Expose
    private Integer daysRead;
    @SerializedName("mean_score")
    @Expose
    private Integer meanScore;
    @SerializedName("reading")
    @Expose
    private Integer reading;
    @SerializedName("completed")
    @Expose
    private Integer completed;
    @SerializedName("on_hold")
    @Expose
    private Integer onHold;
    @SerializedName("dropped")
    @Expose
    private Integer dropped;
    @SerializedName("plan_to_read")
    @Expose
    private Integer planToRead;
    @SerializedName("total_entries")
    @Expose
    private Integer totalEntries;
    @SerializedName("reread")
    @Expose
    private Integer reread;
    @SerializedName("chapters_read")
    @Expose
    private Integer chaptersRead;
    @SerializedName("volumes_read")
    @Expose
    private Integer volumesRead;

    public Integer getDaysRead() {
        return daysRead;
    }

    public void setDaysRead(Integer daysRead) {
        this.daysRead = daysRead;
    }

    public Integer getMeanScore() {
        return meanScore;
    }

    public void setMeanScore(Integer meanScore) {
        this.meanScore = meanScore;
    }

    public Integer getReading() {
        return reading;
    }

    public void setReading(Integer reading) {
        this.reading = reading;
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

    public Integer getPlanToRead() {
        return planToRead;
    }

    public void setPlanToRead(Integer planToRead) {
        this.planToRead = planToRead;
    }

    public Integer getTotalEntries() {
        return totalEntries;
    }

    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }

    public Integer getReread() {
        return reread;
    }

    public void setReread(Integer reread) {
        this.reread = reread;
    }

    public Integer getChaptersRead() {
        return chaptersRead;
    }

    public void setChaptersRead(Integer chaptersRead) {
        this.chaptersRead = chaptersRead;
    }

    public Integer getVolumesRead() {
        return volumesRead;
    }

    public void setVolumesRead(Integer volumesRead) {
        this.volumesRead = volumesRead;
    }
}
