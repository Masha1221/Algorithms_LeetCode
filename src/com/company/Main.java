package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        int[] stairs = new int[n];

        stairs[0] = 1;
        stairs[1] = 2;

        for (int i = 2; i < n; i++)
            stairs[i] = stairs[i - 1] + stairs[i - 2];

        return stairs[n - 1];
    }
}




