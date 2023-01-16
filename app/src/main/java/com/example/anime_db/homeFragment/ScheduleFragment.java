package com.example.anime_db.homeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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


public class ScheduleFragment extends Fragment {
    Spinner spinner;
    private AnimeAdapter animeAdapter;
    String days = "Monday";

    RecyclerView recyclerView;

    private void CallRetrofit() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Response> call = apiInterface.getSchedules(days);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                List<Datum> datumList = response.body().getData();
                animeAdapter = new AnimeAdapter(getContext(), datumList);
                recyclerView.setAdapter(animeAdapter);
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Toast.makeText(getContext(), "Failed to Load Data", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        spinner = view.findViewById(R.id.spinner_schedule);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(
                this.getContext(),
                R.array.days,
                R.layout.spinner_text
        );

        arrayAdapter.setDropDownViewResource(R.layout.spinner_inner_text);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                days = adapterView.getSelectedItem().toString();
                CallRetrofit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        recyclerView = view.findViewById(R.id.rvScheduleAnime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        CallRetrofit();
    }
}