package com.creativesourceapps.android.jokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.creativesourceapps.android.androidlibrary.JokeActivity;
import com.creativesourceapps.android.jokewizard.GetJoke;

public class MainActivity extends AppCompatActivity {
    Button button;
    GetJoke getJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_joke);

        getJoke = new GetJoke();

        final Intent intent = new Intent(this, JokeActivity.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("joke", getJoke.getJoke());

                startActivity(intent);
            }
        });
    }
}
