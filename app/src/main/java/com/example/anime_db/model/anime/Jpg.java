package com.example.anime_db.model.anime;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jpg implements Parcelable {
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("small_image_url")
    @Expose
    private String smallImageUrl;
    @SerializedName("large_image_url")
    @Expose
    private String largeImageUrl;

    public Jpg(Parcel in) {
        imageUrl = in.readString();
        smallImageUrl = in.readString();
        largeImageUrl = in.readString();
    }

    public static final Creator<Jpg> CREATOR = new Creator<Jpg>() {
        @Override
        public Jpg createFromParcel(Parcel in) {
            return new Jpg(in);
        }

        @Override
        public Jpg[] newArray(int size) {
            return new Jpg[size];
        }
    };

    public Jpg() {

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(imageUrl);
        parcel.writeString(smallImageUrl);
        parcel.writeString(largeImageUrl);
    }
}
