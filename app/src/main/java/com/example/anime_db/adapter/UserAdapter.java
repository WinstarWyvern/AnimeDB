package com.example.anime_db.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anime_db.R;
import com.example.anime_db.model.user.DataUser;
import com.example.anime_db.model.user.Jpg;

public class UserAdapter {
    private final Context context;
    private final DataUser dataUser;
    private final View view;
    public UserAdapter(Context context, DataUser dataUser, View view) {
        this.context = context;
        this.dataUser = dataUser;
        this.view = view;
    }

    public void showDataUser(){
        showImageUser();
        showUserName();
        showJoined();
        showLastOnline();
        showDaysWatch();
        showMeanScore();
        showWatching();
        showComplete();
        showOnHold();
        showDropped();
        showPlanToWatch();
        showTotalEntries();
        showRewatched();
        showEpisodeWatch();
    }

    private void showImageUser(){
        ImageView imageUser = view.findViewById(R.id.imgUser);

        Jpg imageUserJpg = new Jpg();
        imageUserJpg.setImageUrl(dataUser.getImages().getJpg().getImageUrl());

        Glide.with(context).load(imageUserJpg.getImageUrl()).into(imageUser);
    }

    private void showUserName(){
        TextView userName = view.findViewById(R.id.nameUser);

        String userNameStr = dataUser.getUsername();

        userName.setText(userNameStr);
    }

    private void showJoined(){
        TextView joined = view.findViewById(R.id.joined);

        String joinedStr = dataUser.getJoined();

        String date = joinedStr.substring(0, joinedStr.indexOf("T"));

        joined.setText(date);
    }

    private void showLastOnline(){
        TextView lastOnline = view.findViewById(R.id.lastOnlineContent);

        String lastOnlineStr = dataUser.getLastOnline();

        String date = lastOnlineStr.substring(0, lastOnlineStr.indexOf("T"));

        lastOnline.setText(date);
    }

    private void showDaysWatch(){
        TextView daysWatch = view.findViewById(R.id.daysWatchContent);

        String daysWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());

        daysWatch.setText(daysWatchStr + " days");
    }

    private void showMeanScore(){
        TextView meanScore = view.findViewById(R.id.meanScoreContent);

        String meanScoreStr = String.valueOf(dataUser.getStatistics().getAnime().getMeanScore());

        meanScore.setText(meanScoreStr);
    }

    private void showWatching(){
        TextView watching = view.findViewById(R.id.watchingContent);

        String watchingStr = String.valueOf(dataUser.getStatistics().getAnime().getWatching());

        watching.setText(watchingStr + " anime");
    }

    private void showComplete(){
        TextView complete = view.findViewById(R.id.completeContent);

        String completeStr = String.valueOf(dataUser.getStatistics().getAnime().getCompleted());

        complete.setText(completeStr + " anime");
    }

    private void showOnHold(){
        TextView onHold = view.findViewById(R.id.onHoldContent);

        String onHoldStr = String.valueOf(dataUser.getStatistics().getAnime().getOnHold());

        onHold.setText(onHoldStr + " anime");
    }

    private void showDropped(){
        TextView dropped = view.findViewById(R.id.droppedContent);

        String droppedStr = String.valueOf(dataUser.getStatistics().getAnime().getDropped());

        dropped.setText(droppedStr + " anime");
    }

    private void showPlanToWatch(){
        TextView planToWatch = view.findViewById(R.id.planToWatchContent);

        String planToWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getPlanToWatch());

        planToWatch.setText(planToWatchStr + " anime");
    }

    private void showTotalEntries(){
        TextView totalEntries = view.findViewById(R.id.totalEntriesContent);

        String totalEntriesStr = String.valueOf(dataUser.getStatistics().getAnime().getTotalEntries());

        totalEntries.setText(totalEntriesStr + " anime");
    }

    private void showRewatched(){
        TextView rewatched = view.findViewById(R.id.rewatchedContent);

        String rewatchedStr = String.valueOf(dataUser.getStatistics().getAnime().getRewatched());

        rewatched.setText(rewatchedStr + " episode");
    }

    private void showEpisodeWatch(){
        TextView episodeWatch = view.findViewById(R.id.episodeWatchContent);

        String episodeWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getEpisodesWatched());

        episodeWatch.setText(episodeWatchStr + " episode");
    }

}
