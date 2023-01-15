package com.example.anime_db.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.anime_db.R;
import com.example.anime_db.model.anime.Datum;
import com.example.anime_db.model.anime.Genre;
import com.example.anime_db.model.anime.Jpg;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class DetailAnimeActivity extends AppCompatActivity {
    public static final String stringData = "stringData";
    public static final Integer integerData = null;
    public static final String pictureData = "pictureData";
    String title, synopsis, imagePath;
    String format, duration, status, startdate,
            enddate, season, producername, studiosname, episodeString, popularityString, membersString, favoriteString, yearString,
    scoreString, genreString, ctr, englishTitle, japanTitle;
    List<Genre> genre;
    Integer episode, popularity, members, favorite, year,genreSize;
    Double score;
    ImageView imgDetail;
    TextView titleDetail, synopsisDetail;
    TextView formatDetail, durationDetail, statusDetail, startdateDetail,
            enddateDetail, seasonDetail, studiosnameDetail, episodeDetail, popularityDetail, membersDetail,
            favoriteDetail, yearDetail, scoreDetail, genreView, englishTitleView, japanTitleView;
    Datum animeData;
    Jpg imageData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);

        titleDetail = findViewById(R.id.titleDetailAnime);
        synopsisDetail = findViewById(R.id.synopsisDetailAnime);
        imgDetail = findViewById(R.id.imgDetailAnime);
        formatDetail = findViewById(R.id.FormatDetailAnime);
        durationDetail = findViewById(R.id.DurationDetailAnime);
        episodeDetail = findViewById(R.id.episodeDetailAnime);
        statusDetail = findViewById(R.id.statusDetailAnime);
//        startdateDetail = findViewById(R.id.startdateDetailAnime);
        seasonDetail = findViewById(R.id.seasonDetailAnime);
        scoreDetail = findViewById(R.id.scoreDetailAnime);
        popularityDetail = findViewById(R.id.popularityDetailAnime);
        membersDetail = findViewById(R.id.membersDetailAnime);
        favoriteDetail = findViewById(R.id.favoriteDetailAnime);
        yearDetail = findViewById(R.id.yearDetailAnime);
//        genreView = findViewById(R.id.genreDetailAnime);
        englishTitleView = findViewById(R.id.englishTitleDetailAnime);
        japanTitleView = findViewById(R.id.japanTitleDetailAnime);


        animeData = getIntent().getParcelableExtra(stringData);
        title = animeData.getTitle();
        synopsis = animeData.getSynopsis();
        format = animeData.getType();
        episode = animeData.getEpisodes();
        episodeString = episode.toString();
        duration = animeData.getDuration();
        status = animeData.getStatus();
//        startdate = animeData.getAired().getFrom();
        season = animeData.getSeason();
        score = animeData.getScore();
        scoreString = score.toString();
        popularity = animeData.getPopularity();
        popularityString = popularity.toString();
        members = animeData.getMembers();
        membersString = members.toString();
        favorite = animeData.getFavorites();
        favoriteString = favorite.toString();
        year = animeData.getYear();
        yearString = year.toString();
//        genreString = animeData.getGenres().get(0).getName();
//        genreString = null;
//            genreSize = animeData.getGenres().size();
//        for (int i=0;i<genreSize;i++){
//            ctr = genre.get(i).getName();
//            genreString = genreString.concat(", ");
//            genreString = genreString.concat(ctr);
//        }
        englishTitle = animeData.getTitleEnglish();
        japanTitle = animeData.getTitleJapanese();


        imageData = getIntent().getParcelableExtra(pictureData);
        imagePath = imageData.getImageUrl();

        titleDetail.setText(title);
        synopsisDetail.setText(synopsis);
        formatDetail.setText(format);
        episodeDetail.setText(episodeString);
        durationDetail.setText(duration);
        statusDetail.setText(status);
//        startdateDetail.setText(startdate);
        seasonDetail.setText(season);
        scoreDetail.setText(scoreString);
        popularityDetail.setText(popularityString);
        membersDetail.setText(membersString);
        favoriteDetail.setText(favoriteString);
        yearDetail.setText(yearString);
//        genreView.setText(genreString);
        englishTitleView.setText(englishTitle);
        japanTitleView.setText(japanTitle);



        Glide.with(getApplicationContext()).load(imagePath).into(imgDetail);
    }
}