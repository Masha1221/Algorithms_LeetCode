package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "intimiccimi";
        String b = "miccimi";
        System.out.println(strStr(a, b));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(0)) continue;

            boolean substring = true;

            for (int j = i; j < i + needle.length(); j++) {
                if (haystack.charAt(j) != needle.charAt(j - i)) substring = false;
            }
            if (substring) return i;
        }
        return -1;
    }
}






