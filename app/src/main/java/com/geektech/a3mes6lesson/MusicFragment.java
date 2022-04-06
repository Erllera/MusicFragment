package com.geektech.a3mes6lesson;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.a3mes6lesson.databinding.FragmentMusicBinding;

import java.util.ArrayList;

public class MusicFragment extends Fragment{
    FragmentMusicBinding binding;
    ArrayList<Music> musics;
    MusicAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMusicBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        musics = new ArrayList<>();
        musics.add(new Music("1","Blink Space","Taylor Swift","3:22"));
        musics.add(new Music("2","Watch Me","Silento","5:36"));
        musics.add(new Music("3","Earned It","The Weekend","4:51"));
        musics.add(new Music("4","The Hills","The Weekend","3:41"));
        musics.add(new Music("5","Writing On The Wall","The Weekend","3:38"));
        adapter = new MusicAdapter(musics, new ClickListener() {
            @Override
            public void click(int pos) {
                Intent intent = new Intent(getContext(),LastActivity.class);
                startActivity(intent);
            }
        });

        binding.recycler.setAdapter(adapter);
    }

}