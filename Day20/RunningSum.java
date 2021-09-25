package com.souvik.Day20;

//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
    int [] nums= { 1 , 2 , 3 , 4 };
    int [] ans =new int[4];
    ans=runningSum(nums);
    System.out.println(Arrays.toString(ans));

    }
    public static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}

