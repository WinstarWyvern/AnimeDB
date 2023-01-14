package com.example.anime_db.homeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anime_db.R;
import com.example.anime_db.model.user.DataUser;
import com.example.anime_db.model.user.Jpg;
import com.example.anime_db.model.user.ResponseUser;
import com.example.anime_db.rest.ApiClient;
import com.example.anime_db.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class UserFragment extends Fragment {
    private String userNameData;

    public UserFragment(String userNameData){
        this.userNameData = userNameData;
    }

    private void setDataUser(DataUser dataUser, View view){

        ImageView imageUser = view.findViewById(R.id.imgUser);
        TextView userName = view.findViewById(R.id.nameUser);
        TextView joined = view.findViewById(R.id.joined);
        TextView lastOnline = view.findViewById(R.id.lastOnlineContent);
        TextView daysWatch = view.findViewById(R.id.daysWatchContent);
        TextView meanScore = view.findViewById(R.id.meanScoreContent);
        TextView watching = view.findViewById(R.id.watchingContent);
        TextView complete = view.findViewById(R.id.completeContent);
        TextView onHold = view.findViewById(R.id.onHoldContent);
        TextView dropped = view.findViewById(R.id.droppedContent);
        TextView planToWatch = view.findViewById(R.id.planToWatchContent);
        TextView totalEntries = view.findViewById(R.id.totalEntriesContent);
        TextView rewatched = view.findViewById(R.id.rewatchedContent);
        TextView episodeWatch = view.findViewById(R.id.episodeWatchContent);

        Jpg imageUserJpg = new Jpg();
        imageUserJpg.setImageUrl(dataUser.getImages().getJpg().getImageUrl());

        String userNameStr = dataUser.getUsername();
        String joinedStr = dataUser.getJoined();
        String lastOnlineStr = dataUser.getLastOnline();
        String daysWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());
        String meanScoreStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());
        String watchingStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());
        String completeStr = String.valueOf(dataUser.getStatistics().getAnime().getCompleted());
        String onHoldStr = String.valueOf(dataUser.getStatistics().getAnime().getOnHold());
        String droppedStr = String.valueOf(dataUser.getStatistics().getAnime().getDropped());
        String planToWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getPlanToWatch());
        String totalEntriesStr = String.valueOf(dataUser.getStatistics().getAnime().getTotalEntries());
        String rewatchedStr = String.valueOf(dataUser.getStatistics().getAnime().getRewatched());
        String episodeWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getEpisodesWatched());

        Glide.with(getContext()).load(imageUserJpg.getImageUrl()).into(imageUser);
        userName.setText(userNameStr);
        joined.setText(joinedStr);
        lastOnline.setText(lastOnlineStr);
        daysWatch.setText(daysWatchStr + " days");
        meanScore.setText(meanScoreStr);
        watching.setText(watchingStr + " anime");
        complete.setText(completeStr + " anime");
        onHold.setText(onHoldStr + " anime");
        dropped.setText(droppedStr + " anime");
        planToWatch.setText(planToWatchStr + " anime");
        totalEntries.setText(totalEntriesStr + " anime");
        rewatched.setText(rewatchedStr + " episode");
        episodeWatch.setText(episodeWatchStr + " episode");
    }

    private void callRetrofit(String userNameData, View view){
        RelativeLayout displayProfile = view.findViewById(R.id.layoutProfile);
        RelativeLayout displayNoUserFound = view.findViewById(R.id.layoutNoUserFound);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<ResponseUser> call = apiInterface.getUserProfile(userNameData);
        call.enqueue(new Callback<ResponseUser>() {
            @Override
            public void onResponse(Call<ResponseUser> call, Response<ResponseUser> response) {
                DataUser dataUser = response.body().getData();
                displayProfile.setVisibility(View.VISIBLE);
                displayNoUserFound.setVisibility(View.GONE);
                setDataUser(dataUser, view);
            }

            @Override
            public void onFailure(Call<ResponseUser> call, Throwable t) {
                displayProfile.setVisibility(View.GONE);
                displayNoUserFound.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        callRetrofit(userNameData, view);

        return view;
    }
}