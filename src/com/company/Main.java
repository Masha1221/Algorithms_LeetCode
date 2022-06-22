package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String a = "fffbfg", b = "effjfggbffjdgbjjhhdegh";
        System.out.println(canConstruct(a, b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c) && map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
                count++;
            }
        }
        return count == ransomNote.length();
    }
}




