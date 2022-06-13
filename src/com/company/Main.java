package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[]{"Saaayhi", "Misha", "OlegOleg", "Nazarchik", "Stephaniya"};
        getCountOfLettersInSetOfWords(strings);
    }

    public static void getCountOfLettersInWord(String word) {
        Map<String, Integer> values = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String t = (word.substring(i, i + 1));
            values.put(t, values.getOrDefault(t, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            System.out.println("Letter: " + entry.getKey() + " Amount: " + entry.getValue());
        }
    }

    public static void getCountOfLettersInSetOfWords(String[] words) {
        System.out.println("The first word - " + words[0] + " contains: ");
        getCountOfLettersInWord(words[0]);
        System.out.println("The second word - " + words[1] + " contains: ");
        getCountOfLettersInWord(words[1]);
        System.out.println("The third word - " + words[2] + " contains: ");
        getCountOfLettersInWord(words[2]);
        System.out.println("The fourth word - " + words[3] + " contains: ");
        getCountOfLettersInWord(words[3]);
        System.out.println("The fifth word - " + words[4] + " contains: ");
        getCountOfLettersInWord(words[4]);

    }
}




