package com.example.lennyyang.memorygameproject;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer extends Object {
    private MediaPlayer mPlayer;

    public void stop(){
        if (mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c){
        mPlayer = MediaPlayer.create(c, R.raw.tell_me_love);
        mPlayer.start();

    }

    public void loop(){
        mPlayer.setLooping(true);
    }

    public void setVolume(int l, int r){
        mPlayer.setVolume(l,r);
    }
}
