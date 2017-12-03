package com.example.lennyyang.memorygameproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by lennyyang on 12/3/17.
 */

public class ScoreActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_submit);

        String value = getIntent().getExtras().getString("test");

        TextView textView = findViewById(R.id.score);
        textView.setText(value);

        System.out.println(value);
    }

    public void onClick(View view) {


    }
}