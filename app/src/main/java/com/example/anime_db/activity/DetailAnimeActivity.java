package com.example.anime_db.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.anime_db.R;
import com.example.anime_db.model.anime.Datum;
import com.example.anime_db.model.anime.Jpg;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailAnimeActivity extends AppCompatActivity {
    public static final String stringData = "stringData";
    public static final String pictureData = "pictureData";
    String title, synopsis, imagePath;
    ImageView imgDetail;
    TextView titleDetail, synopsisDetail;
    Datum animeData;
    Jpg imageData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);

        titleDetail = findViewById(R.id.titleDetailAnime);
        synopsisDetail = findViewById(R.id.synopsisDetailAnime);
        imgDetail = findViewById(R.id.imgDetailAnime);

        animeData = getIntent().getParcelableExtra(stringData);
        title = animeData.getTitle();
        synopsis = animeData.getSynopsis();

        imageData = getIntent().getParcelableExtra(pictureData);
        imagePath = imageData.getImageUrl();

        titleDetail.setText(title);
        synopsisDetail.setText(synopsis);
        Glide.with(getApplicationContext()).load(imagePath).into(imgDetail);
    }
}