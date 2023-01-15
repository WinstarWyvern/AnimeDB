package com.example.anime_db.homeFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.anime_db.R;

import com.example.anime_db.adapter.AnimeAdapter;
import com.example.anime_db.model.anime.Datum;
import com.example.anime_db.model.anime.Response;
import com.example.anime_db.rest.ApiClient;
import com.example.anime_db.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class ListFragment extends Fragment {
    private AnimeAdapter animeAdapter;
    private SearchView searchview;
    Spinner spinnerSeason, spinnerYear;
    String season = "winter";
    String year = "2022";


    RecyclerView recyclerView;

    private void CallRetrofit(){
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Response> call = apiInterface.getAnimeSeasons(year, season);
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

        spinnerSeason = view.findViewById(R.id.spinner_seasons);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(
                this.getContext(),
                R.array.seasons,
                R.layout.spinner_text
        );
        arrayAdapter.setDropDownViewResource(R.layout.spinner_inner_text);
        spinnerSeason.setAdapter(arrayAdapter);
        spinnerSeason.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                season = adapterView.getSelectedItem().toString();
                CallRetrofit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinnerYear = view.findViewById(R.id.spinner_year);
        ArrayAdapter<CharSequence> arrayAdapter2 = ArrayAdapter.createFromResource(
                this.getContext(),
                R.array.year,
                R.layout.spinner_text
        );
        arrayAdapter2.setDropDownViewResource(R.layout.spinner_inner_text);
        spinnerYear.setAdapter(arrayAdapter2);

        spinnerYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                year = adapterView.getSelectedItem().toString();
                CallRetrofit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        recyclerView = view.findViewById(R.id.rvAnime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

//        searchview = (SearchView) view.findViewById(R.id.searchView);
//        searchview.clearFocus();
//        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String textSearch) {
//                if (textSearch.length() > 1){
//                    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
//                    Call<Response> call = apiInterface.getSearch(textSearch);
//                    call.enqueue(new Callback<Response>() {
//                        @Override
//                        public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//                            List<Datum> datumList = response.body().getData();
//                            animeAdapter = new AnimeAdapter(getContext(), datumList);
//                            recyclerView.setAdapter(animeAdapter);
//                        }
//
//                        @Override
//                        public void onFailure(Call<Response> call, Throwable t) {
//
//                        }
//                    });
//                }
//                return true;
//            }
//        });

        CallRetrofit();

        return view;
    }


        }