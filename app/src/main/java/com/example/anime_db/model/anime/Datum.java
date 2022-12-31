package com.example.anime_db.model.anime;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum implements Parcelable {
    @SerializedName("mal_id")
    @Expose
    private Integer malId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("trailer")
    @Expose
    private Trailer trailer;
    @SerializedName("approved")
    @Expose
    private Boolean approved;
    @SerializedName("titles")
    @Expose
    private List<Title> titles = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_english")
    @Expose
    private String titleEnglish;
    @SerializedName("title_japanese")
    @Expose
    private String titleJapanese;
    @SerializedName("title_synonyms")
    @Expose
    private List<String> titleSynonyms = null;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("episodes")
    @Expose
    private Integer episodes;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("airing")
    @Expose
    private Boolean airing;
    @SerializedName("aired")
    @Expose
    private Aired aired;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("score")
    @Expose
    private Double score;
    @SerializedName("scored_by")
    @Expose
    private Integer scoredBy;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("members")
    @Expose
    private Integer members;
    @SerializedName("favorites")
    @Expose
    private Integer favorites;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;
    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("broadcast")
    @Expose
    private Broadcast broadcast;
    @SerializedName("producers")
    @Expose
    private List<Producer> producers = null;
    @SerializedName("licensors")
    @Expose
    private List<Licensor> licensors = null;
    @SerializedName("studios")
    @Expose
    private List<Studio> studios = null;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres = null;
    @SerializedName("explicit_genres")
    @Expose
    private List<Object> explicitGenres = null;
    @SerializedName("themes")
    @Expose
    private List<Theme> themes = null;
    @SerializedName("demographics")
    @Expose
    private List<Demographic> demographics = null;

    public Datum(Parcel in) {
        if (in.readByte() == 0) {
            malId = null;
        } else {
            malId = in.readInt();
        }
        url = in.readString();
        byte tmpApproved = in.readByte();
        approved = tmpApproved == 0 ? null : tmpApproved == 1;
        title = in.readString();
        titleEnglish = in.readString();
        titleJapanese = in.readString();
        titleSynonyms = in.createStringArrayList();
        type = in.readString();
        source = in.readString();
        if (in.readByte() == 0) {
            episodes = null;
        } else {
            episodes = in.readInt();
        }
        status = in.readString();
        byte tmpAiring = in.readByte();
        airing = tmpAiring == 0 ? null : tmpAiring == 1;
        duration = in.readString();
        rating = in.readString();
        if (in.readByte() == 0) {
            score = null;
        } else {
            score = in.readDouble();
        }
        if (in.readByte() == 0) {
            scoredBy = null;
        } else {
            scoredBy = in.readInt();
        }
        if (in.readByte() == 0) {
            rank = null;
        } else {
            rank = in.readInt();
        }
        if (in.readByte() == 0) {
            popularity = null;
        } else {
            popularity = in.readInt();
        }
        if (in.readByte() == 0) {
            members = null;
        } else {
            members = in.readInt();
        }
        if (in.readByte() == 0) {
            favorites = null;
        } else {
            favorites = in.readInt();
        }
        synopsis = in.readString();
        background = in.readString();
        season = in.readString();
        if (in.readByte() == 0) {
            year = null;
        } else {
            year = in.readInt();
        }
    }

    public static final Creator<Datum> CREATOR = new Creator<Datum>() {
        @Override
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        @Override
        public Datum[] newArray(int size) {
            return new Datum[size];
        }
    };

    public Datum() {

    }

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

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public String getTitleJapanese() {
        return titleJapanese;
    }

    public void setTitleJapanese(String titleJapanese) {
        this.titleJapanese = titleJapanese;
    }

    public List<String> getTitleSynonyms() {
        return titleSynonyms;
    }

    public void setTitleSynonyms(List<String> titleSynonyms) {
        this.titleSynonyms = titleSynonyms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getAiring() {
        return airing;
    }

    public void setAiring(Boolean airing) {
        this.airing = airing;
    }

    public Aired getAired() {
        return aired;
    }

    public void setAired(Aired aired) {
        this.aired = aired;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getScoredBy() {
        return scoredBy;
    }

    public void setScoredBy(Integer scoredBy) {
        this.scoredBy = scoredBy;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Licensor> getLicensors() {
        return licensors;
    }

    public void setLicensors(List<Licensor> licensors) {
        this.licensors = licensors;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Object> getExplicitGenres() {
        return explicitGenres;
    }

    public void setExplicitGenres(List<Object> explicitGenres) {
        this.explicitGenres = explicitGenres;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    public List<Demographic> getDemographics() {
        return demographics;
    }

    public void setDemographics(List<Demographic> demographics) {
        this.demographics = demographics;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (malId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(malId);
        }
        parcel.writeString(url);
        parcel.writeByte((byte) (approved == null ? 0 : approved ? 1 : 2));
        parcel.writeString(title);
        parcel.writeString(titleEnglish);
        parcel.writeString(titleJapanese);
        parcel.writeStringList(titleSynonyms);
        parcel.writeString(type);
        parcel.writeString(source);
        if (episodes == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(episodes);
        }
        parcel.writeString(status);
        parcel.writeByte((byte) (airing == null ? 0 : airing ? 1 : 2));
        parcel.writeString(duration);
        parcel.writeString(rating);
        if (score == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(score);
        }
        if (scoredBy == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(scoredBy);
        }
        if (rank == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(rank);
        }
        if (popularity == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(popularity);
        }
        if (members == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(members);
        }
        if (favorites == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(favorites);
        }
        parcel.writeString(synopsis);
        parcel.writeString(background);
        parcel.writeString(season);
        if (year == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(year);
        }
    }
}
