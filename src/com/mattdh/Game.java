package com.mattdh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    // Objects
    Scanner sc = new Scanner(System.in);

    // Variables
    private int tries;
    private String name;
    private String game;
    private String guess;

    public void setupWord(ArrayList<String[]> namesAndGames) {
        int randInt = ThreadLocalRandom.current().nextInt(0, namesAndGames.size());
        name = namesAndGames.get(randInt)[0];
        System.out.println(name);
        game = namesAndGames.get(randInt)[1];
    }

    public void startGame() {
        tries = 10;
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("----------GAME START----------");
        System.out.println("------------------------------");
        System.out.println();

        while (tries > 0) {
            System.out.println("REMAINING TRIES: " + tries);
            System.out.println();

            guess = sc.next();

            if (guess.matches(name)) {
                System.out.println("WIN");
                break;
            } else {
                System.out.println("WRONG");
                tries -= 1;
            }
        }

        if (tries == 0) {
            System.out.println("YOU LOSE");
            System.out.println("THE CHARACTER WAS " + name.toUpperCase());
        }

    }

}
