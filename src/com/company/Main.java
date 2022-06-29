package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String[] k = s.split(" ");

        return k[k.length - 1].length();
    }
}




