package com.company;

import java.util.*;

public class Main {
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        getTheBiggestAmountOfRepeatedWords("а мама мыла Милу мылом и мыла упало");
    }

    public static void getTheBiggestAmountOfRepeatedWords(String s) {
        String[] words = s.split(" ");
        for (String t : words) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        Integer maxValue = Collections.max(map.values());
        String maxKey = null;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKey = (String) entry.getKey();
            }
        }
        System.out.println("The most common word - " + maxKey + ". Appears in the sentence: " + maxValue);
    }
}







