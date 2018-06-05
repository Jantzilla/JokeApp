package com.creativesourceapps.android.jokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.creativesourceapps.android.jokewizard.GetJoke;
import com.creativesourceapps.java.joke.JokeSmith;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    Button button;
    JokeSmith jokeSmith;
    GetJoke getJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view_one);
        textView2 = (TextView) findViewById(R.id.text_view_two);
        button = (Button) findViewById(R.id.btn_joke);

        jokeSmith = new JokeSmith();
        getJoke = new GetJoke();


        textView.setText(jokeSmith.tellAHandCraftedJoke());

        textView2.setText(getJoke.getJoke());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(this, MainActivity.class);

                intent.putExtra("joke", jokeSmith.tellAHandCraftedJoke());

                startActivity(intent);
            }
        });
    }
}
