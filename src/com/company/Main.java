package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertToTitle(2));
    }

    public static String convertToTitle(int columnNumber) {
        String a = "";
        while (columnNumber > 0) {
            columnNumber--;
            int x = (columnNumber) % 26;
            a = (char) (x + 'A') + a;
            columnNumber /= 26;
        }
        return a;
    }
}




