package com.company;

class Main {

    public static void main(String[] args) {
        int[] l = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(l));

    }

    public static int removeDuplicates(int[] nums) {
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                num++;
            } else {
                nums[i - num] = nums[i];
            }
        }
        return nums.length - num;
    }
}





