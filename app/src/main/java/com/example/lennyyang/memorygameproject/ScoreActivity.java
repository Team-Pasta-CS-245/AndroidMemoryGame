package com.example.lennyyang.memorygameproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by lennyyang on 12/3/17.
 */

public class ScoreActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_submit);

        Intent intent = getIntent();
//        String var1 = intent.getStringExtra("key1");
        int i = var2.getIntExtra("key2", 0);
    }

    public void onClick(View view) {


    }
}