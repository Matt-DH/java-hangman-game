package com.mattdh;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    // Variables
    private int tries;
    private String name;
    private String game;

    public void setupWord(ArrayList<String[]> namesAndGames) {
        int randInt = ThreadLocalRandom.current().nextInt(0, namesAndGames.size());
        name = namesAndGames.get(randInt)[0];
        game = namesAndGames.get(randInt)[1];
        System.out.println(name);
        System.out.println(game);
    }

}
