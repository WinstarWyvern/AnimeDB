package com.example.anime_db.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.anime_db.R;
import com.example.anime_db.activity.DetailAnimeActivity;
import com.example.anime_db.model.anime.Datum;
import com.example.anime_db.model.anime.Jpg;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.MyViewHolder> {
    private final Context context;
    private final List<Datum> resultList;

    public AnimeAdapter(Context context, List<Datum> resultList) {
        this.context = context;
        this.resultList = resultList;
    }
    @NonNull
    @Override
    public AnimeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.item_anime, parent, false);

        AnimeAdapter.MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parent.getContext(), DetailAnimeActivity.class);
                Datum animeData = new Datum();
//                animeData = resultList.get(viewHolder.getBindingAdapterPosition());
                animeData.setTitle(resultList.get(viewHolder.getBindingAdapterPosition()).getTitle());
                animeData.setSynopsis(resultList.get(viewHolder.getBindingAdapterPosition()).getSynopsis());
                animeData.setImages(resultList.get(viewHolder.getBindingAdapterPosition()).getImages());

                Jpg imageData = new Jpg();

                imageData.setImageUrl(animeData.getImages().getJpg().getImageUrl());

                intent.putExtra(DetailAnimeActivity.stringData, animeData);
                intent.putExtra(DetailAnimeActivity.pictureData, imageData);
                parent.getContext().startActivity(intent);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.MyViewHolder holder, int position) {
        holder.title.setText(resultList.get(position).getTitle());
        holder.synopsis.setText(resultList.get(position).getSynopsis());
        Glide.with(context).load(resultList.get(position).getImages().getJpg().getImageUrl()).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, synopsis;
        ImageView poster;
        RelativeLayout relativeLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.imgAnime);
            title = itemView.findViewById(R.id.titleAnime);
            synopsis = itemView.findViewById(R.id.synopsisAnime);
            relativeLayout = itemView.findViewById(R.id.layoutSingleAnime);
        }
    }
}
