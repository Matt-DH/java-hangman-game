package com.mattdh;

import java.util.ArrayList;

public interface Visuals {

    String gameStartMessage =
            "\n" +
            "------------------------------\n" +
            "----------GAME START----------\n" +
            "------------------------------\n";
    String hangMan1 =
            "\n" +
                    "  o  \n" +
                    " /|\\ \n" +
                    "  |  \n" +
                    " / \\ \n";
    String hangMan2 =
            "\n" +
                    "  o  \n" +
                    " /|\\ \n" +
                    "  |  \n" +
                    " /\n";
    String hangMan3 =
            "\n" +
                    "  o  \n" +
                    " /|\\ \n" +
                    "  |  \n" +
                    "\n";
    String hangMan4 =
            "\n" +
                    "  o  \n" +
                    " /|\n" +
                    "  |  \n" +
                    "\n";
    String hangMan5 =
            "\n" +
                    "  o  \n" +
                    "  |\n" +
                    "  |  \n" +
                    "\n";
    String hangMan6 =
            "\n" +
                    "  o  \n" +
                    "  |\n" +
                    "\n" +
                    "\n";
    String hangMan7 =
            "\n" +
                    "  o  \n" +
                    "\n" +
                    "\n" +
                    "\n";

    String[] hangManVisuals = new String[] {
            hangMan7, hangMan6, hangMan5, hangMan4, hangMan3, hangMan2, hangMan1
    };
}
