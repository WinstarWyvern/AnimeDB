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

    public void showImageUser(){
        ImageView imageUser = view.findViewById(R.id.imgUser);

        Jpg imageUserJpg = new Jpg();
        imageUserJpg.setImageUrl(dataUser.getImages().getJpg().getImageUrl());

        Glide.with(context).load(imageUserJpg.getImageUrl()).into(imageUser);
    }

    public void showUserName(){
        TextView userName = view.findViewById(R.id.nameUser);

        String userNameStr = dataUser.getUsername();

        userName.setText(userNameStr);
    }

    public void showJoined(){
        TextView joined = view.findViewById(R.id.joined);

        String joinedStr = dataUser.getJoined();

        String date = joinedStr.substring(0, joinedStr.indexOf("T"));

        joined.setText(date);
    }

    public void showLastOnline(){
        TextView lastOnline = view.findViewById(R.id.lastOnlineContent);

        String lastOnlineStr = dataUser.getLastOnline();

        String date = lastOnlineStr.substring(0, lastOnlineStr.indexOf("T"));

        lastOnline.setText(date);
    }

    public void showDaysWatch(){
        TextView daysWatch = view.findViewById(R.id.daysWatchContent);

        String daysWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());

        daysWatch.setText(daysWatchStr + " days");
    }

    public void showMeanScore(){
        TextView meanScore = view.findViewById(R.id.meanScoreContent);

        String meanScoreStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());

        meanScore.setText(meanScoreStr);
    }

    public void showWatching(){
        TextView watching = view.findViewById(R.id.watchingContent);

        String watchingStr = String.valueOf(dataUser.getStatistics().getAnime().getDaysWatched());

        watching.setText(watchingStr + " anime");
    }

    public void showComplete(){
        TextView complete = view.findViewById(R.id.completeContent);

        String completeStr = String.valueOf(dataUser.getStatistics().getAnime().getCompleted());

        complete.setText(completeStr + " anime");
    }

    public void showOnHold(){
        TextView onHold = view.findViewById(R.id.onHoldContent);

        String onHoldStr = String.valueOf(dataUser.getStatistics().getAnime().getOnHold());

        onHold.setText(onHoldStr + " anime");
    }

    public void showDropped(){
        TextView dropped = view.findViewById(R.id.droppedContent);

        String droppedStr = String.valueOf(dataUser.getStatistics().getAnime().getDropped());

        dropped.setText(droppedStr + " anime");
    }

    public void showPlanToWatch(){
        TextView planToWatch = view.findViewById(R.id.planToWatchContent);

        String planToWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getPlanToWatch());

        planToWatch.setText(planToWatchStr + " anime");
    }

    public void showTotalEntries(){
        TextView totalEntries = view.findViewById(R.id.totalEntriesContent);

        String totalEntriesStr = String.valueOf(dataUser.getStatistics().getAnime().getTotalEntries());

        totalEntries.setText(totalEntriesStr + " anime");
    }

    public void showRewatched(){
        TextView rewatched = view.findViewById(R.id.rewatchedContent);

        String rewatchedStr = String.valueOf(dataUser.getStatistics().getAnime().getRewatched());

        rewatched.setText(rewatchedStr + " episode");
    }

    public void showEpisodeWatch(){
        TextView episodeWatch = view.findViewById(R.id.episodeWatchContent);

        String episodeWatchStr = String.valueOf(dataUser.getStatistics().getAnime().getEpisodesWatched());

        episodeWatch.setText(episodeWatchStr + " episode");
    }

}
