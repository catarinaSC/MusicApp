package com.example.catarina.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import android.widget.ListView;

public class Playlist_item extends AppCompatActivity {

    //private ListView listView;
    private SongAdapter mAdapter;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_item);

        final Button button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Playlist_item.this, MainActivity.class));

            }
        });

        listView = (ListView) findViewById(R.id.list);
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("one", "Artist 1", R.drawable.ic_action_name));
        songs.add(new Song("two", "Artist 2", R.drawable.ic_action_name));
        songs.add(new Song("three", "Artist 3", R.drawable.ic_action_name));
        songs.add(new Song("four", "Artist 4", R.drawable.ic_action_name));
        songs.add(new Song("five", "Artist 5", R.drawable.ic_action_name));
        songs.add(new Song("six", "Artist 6", R.drawable.ic_action_name));
        songs.add(new Song("seven", "Artist 7", R.drawable.ic_action_name));
        songs.add(new Song("eight", "Artist 8", R.drawable.ic_action_name));
        songs.add(new Song("nine", "Artist 9", R.drawable.ic_action_name));
        songs.add(new Song("ten", "Artist 10", R.drawable.ic_action_name));


        mAdapter = new SongAdapter(this, songs);
        listView.setAdapter(mAdapter);


    }

}
