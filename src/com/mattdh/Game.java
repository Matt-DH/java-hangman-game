package com.mattdh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game implements Visuals {

    // Objects
    Scanner sc = new Scanner(System.in);

    // Variables
    private int tries = 7;
    private char[] nameCharArray;
    private String name = "";
    private String game;
    private String guess;
    private char[] answerCharArray;

    public void setupWord(ArrayList<String[]> namesAndGames) {
        int randInt = ThreadLocalRandom.current().nextInt(0, namesAndGames.size());
        nameCharArray = namesAndGames.get(randInt)[0].toCharArray();
        game = namesAndGames.get(randInt)[1];
    }

    public void startGame() {

        for (char c : nameCharArray) {
            name += c;
        }

        answerCharArray = name.replaceAll("[A-Za-z]", "#").toCharArray();

        System.out.println(gameStartMessage);
        while (tries > 0) {
            System.out.println(hangManVisuals[tries - 1]);
            System.out.print("NAME:   ");

            for (char c : answerCharArray) {
                System.out.print(String.valueOf(c).toUpperCase());
            }

            System.out.println();
            System.out.println("REMAINING TRIES: " + tries);
            System.out.println();

            System.out.print("GUESS:   ");
            guess = sc.next();

            if (name.contains(guess)) {
                System.out.println();
                System.out.println("CORRECT!");
                while (name.contains(guess)) {
                    answerCharArray[name.indexOf(guess)] = name.charAt(name.indexOf(guess));
                    nameCharArray[name.indexOf(guess)] = '#';
                    name = "";
                    for (char c : nameCharArray) {
                        name += c;
                    }
                }
            } else {
                System.out.println();
                System.out.println("INCORRECT!");
                tries -= 1;
            }

            System.out.println();
            System.out.println("------------------------------");
            System.out.println();
        }

        if (tries == 0) {
            System.out.println("YOU LOSE");
            System.out.println("THE CHARACTER WAS " + name.toUpperCase());
        }

    }

}
