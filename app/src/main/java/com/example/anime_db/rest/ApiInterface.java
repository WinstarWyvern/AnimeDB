package com.example.anime_db.rest;

import com.example.anime_db.model.anime.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("/v4/seasons/now")
    Call<Response> getAnime(
    );

//    @GET("/v4/schedules?{day}")
//    Call<> getSchedules(
//            @Path(value="day", encoded = true) String day
//    );
}
