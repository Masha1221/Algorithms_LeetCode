package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isHappy(23));
    }

    public static boolean isHappy(int n) {
        if (n < 0)
            return false;
        int rounds = 0;
        while (sum(n) != 1) {
            n = sum(n);
            rounds++;
            if (rounds > 5)
                return false;
        }
        return true;
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += (digit * digit);
            num = num / 10;
        }
        return sum;
    }
}