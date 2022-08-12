package com.mattdh;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    // Objects
    static Scanner sc = new Scanner(System.in);
    static Words words = new Words();
    static Game game = new Game();

    // Variables
    static String inputDifficulty;
    static boolean difficultySet = false;
    
    public static void main(String[] args) {
        
        System.out.println("------------------------------");
        System.out.println("    GAME CHARACTER HANGMAN    ");
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("Select your difficulty:");
        System.out.println("EASY");
        System.out.println("MEDIUM");
        System.out.println("HARD");
        System.out.println("RANDOM");
        
        while (difficultySet == false) {
            ArrayList<String[]> arrayList = chooseDifficulty();
            if (!(arrayList == null)) {
                game.setupWord(arrayList);
            }
        }

        game.startGame();

    }
    
    private static ArrayList<String[]> chooseDifficulty() {

        ArrayList<String[]> returnList = null;
        
        try {
            inputDifficulty = sc.next();
            switch (inputDifficulty.toLowerCase()) {
                case "easy":
                    returnList = words.setDifficulty(0);
                    difficultySet = true;
                    break;
                case "medium":
                    returnList = words.setDifficulty(1);
                    difficultySet = true;
                    break;
                case "hard":
                    returnList = words.setDifficulty(2);
                    difficultySet = true;
                    break;
                case "random":
                    returnList = words.setDifficulty(ThreadLocalRandom.current().nextInt(0, 3));
                    difficultySet = true;
                    break;
                default:
                    System.out.println("INVALID DIFFICULTY, TRY AGAIN");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Exception has occurred");
        }
        return returnList;
    }
    
}
