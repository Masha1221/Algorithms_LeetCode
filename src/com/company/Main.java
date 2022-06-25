package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[k++];
            if (k == nums2.length)
                break;
        }
        Arrays.sort(nums1);
    }
}