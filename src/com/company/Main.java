package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int [] a = new int[]{2,3,4,2,4,3,4,2,1};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int e = 0;

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
            count = Math.max(count, map.get(i));
            if (count == map.get(i)) {
                e = i;
            }
        }
        return e;
    }
}