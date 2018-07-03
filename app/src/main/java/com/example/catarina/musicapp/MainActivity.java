package com.example.catarina.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the playlist

        TextView playlist = (TextView) findViewById(R.id.Playlist);

        // The code in this method will be executed when the playlist category is clicked on.
        playlist.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            // Create a new intent to open the {@link Playlist_item}
            Intent playlistIntent = new Intent(MainActivity.this, Playlist_item.class);

            // Start the new activity
            startActivity(playlistIntent);
        }
    });

    TextView search = (TextView) findViewById(R.id.new_search);
     search.setOnClickListener(new View.OnClickListener () {
        @Override
        public void onClick(View view) {
            Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(searchIntent);
        }
    });

}
}

