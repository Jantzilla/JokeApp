package com.creativesourceapps.android.jokewizard;

import com.creativesourceapps.java.joke.JokeSmith;

public class GetJoke {

    public String getJoke() {
        JokeSmith jokeSmith = new JokeSmith();

        return jokeSmith.tellAHandCraftedJoke();
    }
}
