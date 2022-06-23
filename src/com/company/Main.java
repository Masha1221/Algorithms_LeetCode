package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 4}, {3, 2, 1}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int n = accounts[0].length;
        int m = accounts.length;
        int sum = 0;
        int max = accounts[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > max)
                max = sum;
            sum = 0;
        }
        return max;
    }
}