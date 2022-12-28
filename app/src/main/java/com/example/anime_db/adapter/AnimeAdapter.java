package com.example.anime_db.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.anime_db.R;
import com.example.anime_db.data.Datum;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.MyViewHolder> {
    private Context context;
    private List<Datum> resultList;

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

        AnimeAdapter.MyViewHolder viewHolder = new AnimeAdapter.MyViewHolder(view);
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

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, synopsis;
        ImageView poster;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.imgAnime);
            title = itemView.findViewById(R.id.titleAnime);
            synopsis = itemView.findViewById(R.id.synopsisAnime);
        }
    }
}
