package com.company;


public class Main {

    public static void main(String[] args) {
        int[] n = new int[]{2, 3, 4, 8, 9, 11, 12, 13};
        int h = 10;
        System.out.println(searchInsert(n, h));
    }

    public static int searchInsert(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        if (target == nums[firstIndex]) {
            return firstIndex;
        }
        if (target > nums[lastIndex]) {
            return lastIndex + 1;
        }
        if (target < nums[0]) {
            return 0;
        }
        while (firstIndex <= lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            if (target == nums[middleIndex]) {
                return middleIndex;
            } else if (target < nums[middleIndex]) {
                lastIndex = middleIndex - 1;
            } else if (target < nums[middleIndex] && target > nums[middleIndex - 1]) {
                return middleIndex;
            } else if (target > nums[middleIndex] && target < nums[middleIndex + 1]) {
                return middleIndex + 1;
            } else if (target > nums[middleIndex]) {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
