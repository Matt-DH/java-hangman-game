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
    List<String> words;

    public List<String> setDifficulty(int i) {
        try {
            switch (i) {
                case 0:
                    file = new FileReader("words_easy.txt");
                    break;
                case 1:
                    file = new FileReader("words_medium.txt");
                    break;
                case 2:
                    file = new FileReader("words_hard.txt");
                    break;
            }
            bufferedReader = new BufferedReader(file);
            words = bufferedReader.lines().toList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

}
