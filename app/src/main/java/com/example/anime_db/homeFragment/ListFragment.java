package com.example.anime_db.homeFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.anime_db.R;
import com.example.anime_db.adapter.AnimeAdapter;
import com.example.anime_db.model.Datum;
import com.example.anime_db.rest.ApiClient;
import com.example.anime_db.rest.ApiInterface;
import com.example.anime_db.model.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class ListFragment extends Fragment {
    private AnimeAdapter animeAdapter;
    private SearchView searchView;
//    String param1 = "v4/seasons/now";
//    int page = 1;
    RecyclerView recyclerView;

    private void CallRetrofit() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Response> call = apiInterface.getAnime();
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                List<Datum> datumList = response.body().getData();
                animeAdapter = new AnimeAdapter(getContext(), datumList);
                recyclerView.setAdapter(animeAdapter);
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = view.findViewById(R.id.rvAnime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        CallRetrofit();

        return view;
    }
}