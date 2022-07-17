package ru.javarush.cryptoanalyser.ivannikov.actions;

import ru.javarush.cryptoanalyser.ivannikov.exception.ApplicationException;
import ru.javarush.cryptoanalyser.ivannikov.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static ru.javarush.cryptoanalyser.ivannikov.constants.Methods.encrypted;

public class Encrypt {
    public static void encrypt() {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Encryption program started");
            System.out.println("enter the key");
            int keyEncrypt = scanner.nextInt();
            // TODO checking for a number
            System.out.println("enter text or file path");
            Thread.sleep(1000);
            System.out.println("file path received, start encryption");
            String txtFile = "text.txt";
            String encodeFile = "encodeFile.txt";
            Path path = Path.of(PathFinder.getRoot(), txtFile);
            Path path1 = Path.of(PathFinder.getRoot(), encodeFile);
            List<String> strings = Files.readAllLines(path);
            encrypted(sb, keyEncrypt, strings);
            System.out.print(sb);
            Files.writeString(path1, sb);
            System.out.println("\n\nThe program completed successfully, your file is located on " + path1);

        } catch (IOException | InterruptedException e) {
            throw new ApplicationException("encrypt");
        }
    }
}

