/***************************************************************
 * file: AudioPlayer.java
 * author: Lenny Yang, Rachel Frodsham, Jenna Barret
 * class: CS 245.01 – Programming Graphical User Interfaces
 *
 * assignment: Android Project
 * date last modified: 12/05/2017
 *
 * purpose:  This program creates the background music for the app
 *
 ****************************************************************/
package com.example.lennyyang.memorygameproject;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer extends Object {
    public MediaPlayer mPlayer;

    public void stop(){
        if (mPlayer != null){
            mPlayer.stop();
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c){
        mPlayer = MediaPlayer.create(c, R.raw.sesame_street_the_pasta_song);
        mPlayer.start();
    }

    public void loop(){
        mPlayer.setLooping(true);
    }

    public void setVolume(int l, int r){
        mPlayer.setVolume(l,r);
    }
    
    public void resume() {
        mPlayer.start();
    }
}
