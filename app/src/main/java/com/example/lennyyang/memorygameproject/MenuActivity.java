package com.example.lennyyang.memorygameproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button button2x2;
    private Button button2x3;
    private Button button2x4;
    private Button button2x5;
    private Button button3x4;
    private Button button2x7;
    private Button button4x4;
    private Button button3x6;
    private Button button4x5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

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
    }
}
