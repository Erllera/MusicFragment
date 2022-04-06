package com.geektech.a3mes6lesson;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    ArrayList<Music> music;
    ClickListener listener;

    public MusicAdapter(ArrayList<Music> music, ClickListener listener) {
        this.music = music;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(music.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return music.size();
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {
        TextView number, name, author, time;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number);
            name = itemView.findViewById(R.id.music_name);
            author = itemView.findViewById(R.id.music_author);
            time = itemView.findViewById(R.id.music_time);
        }

        public void bind(Music musics) {
            this.number.setText(musics.getNumber());
            this.name.setText(musics.getName());
            this.author.setText(musics.getAuthor());
            this.time.setText(musics.getTime());
        }
    }
}
