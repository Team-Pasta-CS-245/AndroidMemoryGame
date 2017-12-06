package com.example.lennyyang.memorygameproject;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

/**
 * Created by lennyyang on 12/3/17.
 */

public class ScoreActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_submit);

        String value = getIntent().getExtras().getString("test");

        TextView textView = findViewById(R.id.score);
        textView.setText(value);

        final EditText nameView = findViewById(R.id.scoreName);

        final String theHighScore = textView.getText().toString();

        Button yourButton = findViewById(R.id.submit_button);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                final String theName = nameView.getText().toString();
                Log.d("checker", "Click registered.");
                Log.d("check", theName);
                Log.d("check", theHighScore);
                writeToFile(theName + theHighScore, getApplicationContext());
                startActivity(new Intent(ScoreActivity.this, MenuActivity.class));
            }
        });
    }

    public void onClick(View view) {

//        final Button submitHighScores = findViewById(R.id.submit_button);
//
//        submitHighScores.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    JSONObject obj = new JSONObject(loadJSONFromAsset(getApplicationContext()));
//                    writeJSON(obj);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                Intent myIntent = new Intent(ScoreActivity.this, MenuActivity.class);
//                startActivity(myIntent);
//            }
//
//
//        });

//        Button yourButton = findViewById(R.id.submit_button);
//
//        yourButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                startActivity(new Intent(ScoreActivity.this, MenuActivity.class));
//            }
//        });

    }

    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("highscores.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

    private void writeToFile(String data,Context context) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("highscores.json", Context.MODE_PRIVATE));
            Log.d("writer","write method");
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }
}