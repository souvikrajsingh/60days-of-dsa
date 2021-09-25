package com.souvik.Day20;

//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class Concatination {

    public static void main(String[] args) {
        int[] nums= { 1,2,3};
        int[] ans = new int[6];
        ans=getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*(nums.length)];
        for (int i = 0; i < nums.length; i++) {

            ans[i]=nums[i];

        }
        for (int i = 0; i < nums.length; i++) {

            ans[i+ nums.length]=nums[i];
        }
        return ans;

    }

}
