package ru.javarush.cryptoanalyser.ivannikov.menu;

import static ru.javarush.cryptoanalyser.ivannikov.logic.Logic.logic;

public class Menu {
    public static void menu (){

        System.out.println("!!!!!!!!!The application is in test mode!!!!!!!!!!");
        System.out.println("==============================================================================");
        System.out.println("Press 1 to encrypt text");
        System.out.println("Press 2 to decrypt text");
        System.out.println("To search for a key using the bruteforce method to decrypt the text, press 3");
        System.out.println("To parse press 4");
        System.out.println("press 0 to exit the program");
        System.out.println("===============================================================================");
        logic();
    }
}
