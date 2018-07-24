package com.example.catarina.musicapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    private Context mContext;

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context,0, songs);
        mContext = context;
    }

        @Override
        public View getView (int position, View convertView, ViewGroup parent){

            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;

            if (listItemView == null)
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list, parent, false);

            Song songList = getItem(position);

            TextView song = (TextView) listItemView.findViewById(R.id.song_text_view);
            song.setText(songList.getSongOrder());
            TextView artist = (TextView) listItemView.findViewById(R.id.artist_text_view);
            artist.setText(songList.getArtistOrder());


            ImageView play_image_view = (ImageView) listItemView.findViewById(R.id.play_button);
            if (songList.isImageProvided()) {
                play_image_view.setImageResource(songList.getImageResourceID());
            } else {
                play_image_view.setVisibility(View.GONE);
            }


            return listItemView;
        }
}