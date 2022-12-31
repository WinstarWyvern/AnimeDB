package com.example.anime_db.rest;

import com.example.anime_db.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/v4/seasons/now")
    Call<Response> getAnime(
//            @Path("param1") String param1
//            @Query("api_key") String api_key,
//            @Query("page") int page
    );
}
