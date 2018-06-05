package com.creativesourceapps.android.jokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.creativesourceapps.android.jokewizard.GetJoke;
import com.creativesourceapps.java.joke.JokeSmith;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    JokeSmith jokeSmith;
    GetJoke getJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeSmith = new JokeSmith();
        getJoke = new GetJoke();


        textView.setText(jokeSmith.tellAHandCraftedJoke());

        textView2.setText(getJoke.getJoke());
    }
}
