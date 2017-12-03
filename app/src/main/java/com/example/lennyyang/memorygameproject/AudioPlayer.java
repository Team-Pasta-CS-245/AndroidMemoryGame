package com.example.lennyyang.memorygameproject;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer extends Object {
    public MediaPlayer mPlayer;

    public void stop(){
        if (mPlayer != null){
//            mPlayer.stop();
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c){
        mPlayer = MediaPlayer.create(c, R.raw.game_music);
        mPlayer.start();
    }

    public void loop(){
        mPlayer.setLooping(true);
    }

    public void setVolume(int l, int r){
        mPlayer.setVolume(l,r);
    }
}