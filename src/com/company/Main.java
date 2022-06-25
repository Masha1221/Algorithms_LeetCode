package com.company;

public class Main {

    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3, 4, 4};
        int[] k = plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.println(k[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] == 9) {
                digits[i] = 0;
                i--;
            } else {
                digits[i] += 1;
                break;
            }
        }
        if (i >= 0)
            return digits;
        else {
            int[] n = new int[digits.length + 1];
            n[0] = 1;
            return n;
        }
    }
}




