package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer[] example = new Integer[]{2, 4, 3, 13, 2, 16, 12, 12, 15, 16, 2, 16,
                19, 20, 19, 2, 1, 1, 19};
        getValuesThatAreDuplicated(example);
    }

    public static void getValuesThatAreDuplicated(Integer[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> keys = new ArrayList<>();
        for (Integer t : numbers) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                keys.add(entry.getKey());
            }
        }
        System.out.println("The numbers which have duplicate: "
                + keys.toString().replaceAll("^\\[|\\]$", ""));
    }
}






