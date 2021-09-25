package com.souvik.Day21;

//https://leetcode.com/problems/number-of-good-pairs/

public class GoodPair {
    public static void main(String[] args) {
        int [] nums = { 1,2,3,1,1,3};
        int c=numIdenticalPairs(nums);
        System.out.println(c);
    }
    public static int numIdenticalPairs(int[] nums) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i+1); j <nums.length ; j++) {
                if(nums[i]==nums[j])
                {
                    c=c+1;
                }
            }
        }
        return c;
    }
}
