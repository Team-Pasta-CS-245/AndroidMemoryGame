package com.example.lennyyang.memorygameproject;

import android.content.res.Resources;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class HighScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores);
        Resources res = getResources();

        InputStream is = res.openRawResource(R.raw.highscores);

        Scanner scanner = new Scanner(is);

        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()){
            builder.append(scanner.nextLine());
        }

        String result;
        try {
            InputStream in_s = res.openRawResource(R.raw.highscores);

            byte[] b = new byte[in_s.available()];
            in_s.read(b);
            result = new String(b);
        } catch (Exception e) {
            // e.printStackTrace();
            result = "Error: can't show file.";
        }

        TextView txtDisplay = findViewById(R.id.high_score_info);
        txtDisplay.setText(result.toString()); ////Set the text to text view.

//        parseJson(builder.toString());
    }

    private void parseJson(String s) {

//        TextView txtDisplay = findViewById(R.id.high_score_info);
//
//        StringBuilder builder = new StringBuilder();
//
//        try {
//            JSONObject root = new JSONObject(s);
//
//            JSONObject student = root.getJSONObject("scores");
//
//            JSONArray courses = student.getJSONArray("highscores");
//
//            for(int i = 0; i < courses.length(); i++){
//                JSONObject course = courses.getJSONObject(i);
//                builder.append("Name: ")
//                        .append(course.getString("name"))
//                        .append(" | Score: ")
//                        .append(course.getString("score"))
//                        .append(" |Type: ")
//                        .append(course.getString("type"))
//                        .append("\n");
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        txtDisplay.setText(builder.toString());
    }
}