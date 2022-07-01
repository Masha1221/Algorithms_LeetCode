package com.company;

public class Main {

    public static void main(String[] args) {
        int[] p = new int[]{2, 1, 3, 2, 4, 5, 3, 1};
        System.out.println(majorityElement(p));
    }

    public static int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                number = nums[i];
            if (number == nums[i])
                count++;
            else
                count--;
        }
        return number;
    }
}