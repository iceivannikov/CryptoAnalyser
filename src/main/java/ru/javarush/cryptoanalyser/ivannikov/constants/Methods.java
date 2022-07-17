package ru.javarush.cryptoanalyser.ivannikov.constants;

import java.util.List;

import static ru.javarush.cryptoanalyser.ivannikov.constants.Alphabet.ALPHABET;

public class Methods {
    public static String encrypted(StringBuilder sb, int keyEncrypt, List<String> strings) {
        for (String string : strings) {
            char[] chars = string.toLowerCase().toCharArray();
            for (char aChar : chars) {
                if (ALPHABET.indexOf(aChar) != -1) {
                    char c = ALPHABET.charAt((ALPHABET.indexOf(aChar) + keyEncrypt) % ALPHABET.length());
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static String encrypted2(StringBuilder sb, int keyEncrypt, List<String> strings) {
        for (String string : strings) {
            char[] chars = string.toLowerCase().toCharArray();
            for (char aChar : chars) {
                if (ALPHABET.indexOf(aChar) != -1) {
                    char c = ALPHABET.charAt((ALPHABET.indexOf(aChar) + keyEncrypt) % ALPHABET.length());
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

}
