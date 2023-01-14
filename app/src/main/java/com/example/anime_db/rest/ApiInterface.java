package com.example.anime_db.rest;

import com.example.anime_db.model.user.ResponseUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/v4/seasons/now")
    Call<com.example.anime_db.model.anime.Response> getAnime(
    );

    @GET("/v4/schedules")
    Call<com.example.anime_db.model.anime.Response> getSchedules(
            @Query("filter") String filter
//            @Path(value="day", encoded = true) String day
    );

    @GET("v4/users/{username}/full")
    Call<ResponseUser> getUserProfile(
        @Path("username") String username
    );
}
