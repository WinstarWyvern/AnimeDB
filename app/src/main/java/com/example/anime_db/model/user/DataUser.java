package com.example.anime_db.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataUser {
    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("last_online")
    @Expose
    private String lastOnline;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("birthday")
    @Expose
    private Object birthday;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("joined")
    @Expose
    private String joined;
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;
    @SerializedName("favorites")
    @Expose
    private Favorite favorites;
    @SerializedName("updates")
    @Expose
    private Updates updates;
    @SerializedName("about")
    @Expose
    private Object about;
    @SerializedName("external")
    @Expose
    private List<External> external = null;

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(String lastOnline) {
        this.lastOnline = lastOnline;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Favorite getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorite favorites) {
        this.favorites = favorites;
    }

    public Updates getUpdates() {
        return updates;
    }

    public void setUpdates(Updates updates) {
        this.updates = updates;
    }

    public Object getAbout() {
        return about;
    }

    public void setAbout(Object about) {
        this.about = about;
    }

    public List<External> getExternal() {
        return external;
    }

    public void setExternal(List<External> external) {
        this.external = external;
    }
}
