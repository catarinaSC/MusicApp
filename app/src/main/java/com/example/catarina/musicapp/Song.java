package com.example.catarina.musicapp;

public class Song {

    private String songOrder;
    private String artistOrder;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    // Constructor that is used to create an instance of the song object
    public Song(String mSongOrder, String mArtistOrder, int mImageResourceID) {
        this.songOrder = mSongOrder;
        this.artistOrder = mArtistOrder;
        this.imageResourceID = mImageResourceID;

        }

    public int getImageResourceID() {
        return imageResourceID;
    }

    //public void setImageResourceID(int imageResourceID) {
        //this.imageResourceID = imageResourceID;
    //}

    public String getArtistOrder() {
        return artistOrder;
    }

   // public void setArtistOrder(String artistOrder) {
        //this.artistOrder = artistOrder;
    //}

    public String getSongOrder() {
        return songOrder;
    }

    //public void setSongOrder(String songOrder) {
        //this.songOrder = songOrder;
    //}

    public boolean isImageProvided() {
        return !(imageResourceID == NO_IMAGE_PROVIDED);
    }

}
