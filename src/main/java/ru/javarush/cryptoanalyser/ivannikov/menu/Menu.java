package ru.javarush.cryptoanalyser.ivannikov.menu;

import static ru.javarush.cryptoanalyser.ivannikov.logic.Logic.logic;

public class Menu {
    public static void menu (){

        System.out.println("!!!!!!!!!The application is in test mode!!!!!!!!!!");
        System.out.println("========================================");
        System.out.println("Press 1 to encrypt text");
        System.out.println("Press 2 to decrypt text");
        System.out.println("press 3 to find the key");
        System.out.println("press 4 for statistical analysis");
        System.out.println("press 0 to exit the program");
        System.out.println("=========================================");
        logic();
    }
}
