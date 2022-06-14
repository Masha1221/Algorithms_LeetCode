package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list;
        list = Arrays.asList(new Integer[]{2, 4, 3, 13, 2, 16, 12, 5, 67, 2, 4, 78, 1, 13, 67, 78});
        getValuesThatAreDuplicated(list);
    }

    public static void getValuesThatAreDuplicated(List<Integer> numbers) {
        Set<Integer> num = new HashSet<>();
        for (Integer s : numbers) {
            if ((Collections.frequency(numbers, s) > 1)) {
                num.add(s);
            }
        }
        System.out.println("The numbers which have duplicate: "
                + num.toString().replaceAll("^\\[|\\]$", ""));
    }
}