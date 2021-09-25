package com.souvik.Day20;

//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = 3;


       /*required output:

        nums= { 1,4,2,5,3,6};

       * */

        int[] ans = new int[6];
        ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[2 * n];
        int p = 0;
        int q = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                arr[i] = nums[p];
                p = p + 1;
            } else {
                arr[i] = nums[q];
                q = q + 1;
            }
        }
        return arr;
    }
}
