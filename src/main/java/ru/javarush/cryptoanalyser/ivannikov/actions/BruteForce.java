package ru.javarush.cryptoanalyser.ivannikov.actions;

import ru.javarush.cryptoanalyser.ivannikov.exception.ApplicationException;
import ru.javarush.cryptoanalyser.ivannikov.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static ru.javarush.cryptoanalyser.ivannikov.constants.Alphabet.ALPHABET;
import static ru.javarush.cryptoanalyser.ivannikov.constants.Methods.encrypted;

public class BruteForce {
    public static void bruteForce() {

        StringBuilder sb = new StringBuilder();
        String decodedFile = "decodedFile.txt";
        String encodeFile = "encodeFile.txt";
        String bruteForceFile = "bruteForceFile.txt";
        Path path = Path.of(PathFinder.getRoot(), decodedFile);
        Path path1 = Path.of(PathFinder.getRoot(), encodeFile);
        Path path2 = Path.of(PathFinder.getRoot(), bruteForceFile);

        try {
            List<String> stringsEncodeFile = Files.readAllLines(path1);
            List<String> stringsDecodedFile = Files.readAllLines(path);
            String s = stringsDecodedFile.toString();


            for (int keyBruteForce = 1; keyBruteForce < 6; keyBruteForce++) {
                if (!(sb.toString().equals(s))) {
                    System.out.println("Попытка № " + keyBruteForce);
                    encrypted(sb, ALPHABET.length() - (keyBruteForce % ALPHABET.length()), stringsEncodeFile);
                }
            }
            System.out.print(sb);
            Files.writeString(path2, sb);

        } catch (IOException e) {
            throw new ApplicationException("bruteForce");
        }
    }
}