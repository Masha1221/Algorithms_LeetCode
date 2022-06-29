package com.company;

public class Main {

    public static void main(String[] args) {
        int[] l = new int[]{2, 4, 1};
        System.out.println(maxProfit(l));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}