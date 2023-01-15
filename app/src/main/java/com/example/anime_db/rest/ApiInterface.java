package com.example.anime_db.rest;

import com.example.anime_db.model.anime.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiInterface {
    @GET("/v4/seasons/now")
    Call<Response> getAnime(
    );

//    @GET("/v4/seasons")
//    Call<Response> getSeasons(
//    );

//    @GET("/v4/seasons/{year}/{season}")
//    Call<com.example.anime_db.model.season.Response> getAnimeSeasons(
//            @Path(value="year", encoded = true) String year,
//            @Path(value="season", encoded = true) String season
//    );

        @GET("/v4/seasons/{year}/{season}")
        Call<Response> getAnimeSeasons(
            @Path(value="year") String year,
            @Path(value="season") String season
    );

//    @GET("/v4/seasons/{year}/{season}")
//    Call<com.example.anime_db.model.season.Response> getAnimeSeasons(
//            @Url String year,
//            @Url String season
//    );

    @GET("/v4/schedules")
    Call<Response> getSchedules(
            @Query("filter") String filter
//            @Path(value="day", encoded = true) String day
    );

//    @GET("/v4/anime?q={name}&sfw")
//    Call<Response> getSearch(
//            @Path("name") String Name
//    );


}
