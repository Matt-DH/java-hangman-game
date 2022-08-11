package com.mattdh;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

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
        
        while (difficultySet == false) {
            game.setupWord(chooseDifficulty());
        }
        
    }
    
    private static ArrayList<String[]> chooseDifficulty() {

        ArrayList<String[]> returnList = null;
        
        try {
            inputDifficulty = sc.next();
            switch (inputDifficulty.toLowerCase(Locale.ROOT)) {
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
