package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(12));
    }

    public static int numberOfSteps(int num) {
        int countOfSteps = 0;
        while (0 < num) {
            if (num % 2 == 0) {
                num /= 2;
                countOfSteps++;
            } else if (num % 2 != 0) {
                num -= 1;
                countOfSteps++;
            }
            if (num == 0) {
                return countOfSteps;
            }
        }
        return countOfSteps;
    }
}




