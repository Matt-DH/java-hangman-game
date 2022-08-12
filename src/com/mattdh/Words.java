package com.mattdh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Words {

    // Variables
    FileReader file;
    BufferedReader bufferedReader;
    List<String> lines;
    String[] lineArray;
    ArrayList<String[]> namesAndGames = new ArrayList<>();

    public ArrayList<String[]> setDifficulty(int i) {
        try {
            switch (i) {
                case 0:
                    file = new FileReader("words_easy.txt");
                    System.out.println();
                    System.out.println("DIFFICULTY: EASY");
                    System.out.println();
                    break;
                case 1:
                    file = new FileReader("words_medium.txt");
                    System.out.println("DIFFICULTY: MEDIUM");
                    break;
                case 2:
                    file = new FileReader("words_hard.txt");
                    System.out.println("DIFFICULTY: HARD");
                    break;
            }
            bufferedReader = new BufferedReader(file);
            lines = bufferedReader.lines().toList();
            for (String line : lines) {
                lineArray = line.split(",");
                namesAndGames.add(lineArray);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return namesAndGames;
    }

}
