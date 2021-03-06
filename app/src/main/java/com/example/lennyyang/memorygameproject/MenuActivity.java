/***************************************************************
 * file: MenuActivity.java
 * author: Lenny Yang, Rachel Frodsham, Jenna Barret
 * class: CS 245.01 – Programming Graphical User Interfaces
 *
 * assignment: Android Project
 * date last modified: 12/05/2017
 *
 * purpose:  This program creates a menu of buttons
 *
 ****************************************************************/
package com.example.lennyyang.memorygameproject;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MenuActivity extends AppCompatActivity {

    AudioPlayer audioPlayer = new AudioPlayer();

    private Button button2x2;
    private Button button2x3;
    private Button button2x4;
    private Button button2x5;
    private Button button3x4;
    private Button button2x7;
    private Button button4x4;
    private Button button3x6;
    private Button button4x5;
    private ToggleButton musicOnOff;
    private Button highScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        highScores = findViewById(R.id.high_scores);
        highScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HighScoreActivity.class);
                startActivity(intent);
            }
        });

        button2x2 = findViewById(R.id.button_2x2_game);
        button2x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game2x2Activity.class);
                startActivity(intent);
            }
        });

        button2x3 = findViewById(R.id.button_2x3_game);
        button2x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game2x3Activity.class);
                startActivity(intent);
            }
        });

        button2x4 = findViewById(R.id.button_2x4_game);
        button2x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game2x4Activity.class);
                startActivity(intent);
            }
        });

        button2x5 = findViewById(R.id.button_2x5_game);
        button2x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game2x5Activity.class);
                startActivity(intent);
            }
        });

        button3x4 = findViewById(R.id.button_3x4_game);
        button3x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game3x4Activity.class);
                startActivity(intent);
            }
        });

        button2x7 = findViewById(R.id.button_2x7_game);
        button2x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game2x7Activity.class);
                startActivity(intent);
            }
        });

        button4x4 = findViewById(R.id.button_4x4_game);
        button4x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game4x4Activity.class);
                startActivity(intent);
            }
        });

        button3x6 = findViewById(R.id.button_3x6_game);
        button3x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game3x6Activity.class);
                startActivity(intent);
            }
        });

        button4x5 = findViewById(R.id.button_4x5_game);
        button4x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, Game4x5Activity.class);
                startActivity(intent);
            }
        });

        musicOnOff = findViewById(R.id.toggleButton);
        musicOnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    audioPlayer.play(getApplicationContext());
                    audioPlayer.loop();
                    audioPlayer.setVolume(100,100);
                } else {
                    audioPlayer.stop();
                }
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.

        savedInstanceState.putBoolean("isChecked", true);
        savedInstanceState.putDouble("myDouble", 1.9);
        savedInstanceState.putInt("MyInt", 1);
        savedInstanceState.putString("MyString", "Welcome back to Android");

        // etc.

        super.onSaveInstanceState(savedInstanceState);
    }

//onRestoreInstanceState

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        boolean myBoolean = savedInstanceState.getBoolean("MyBoolean");
        double myDouble = savedInstanceState.getDouble("myDouble");
        int myInt = savedInstanceState.getInt("MyInt");
        String myString = savedInstanceState.getString("MyString");
    }
}
