package com.geektech.a3mes6lesson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.a3mes6lesson.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

/*        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.music_container,new MusicFragment()).commit();
        }*/
    }
}