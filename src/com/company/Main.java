package com.company;

public class Main {

    public static void main(String[] args) {
        int y = 121;
        System.out.println(isPalindrome(y));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String number = Integer.toString(x);
        StringBuffer buffer = new StringBuffer(number);
        buffer.reverse();
        String reverseNumber = new String(buffer);
        return reverseNumber.equals(number);
    }
}




