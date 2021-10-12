package com.souvik.Day31;

//https://leetcode.com/problems/find-the-duplicate-number/

public class LC_287_DuplicateNumber {

    public static void main(String[] args)
    {
        int[] nums = { 1,3,3,4,5,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums)
    {
        int i , j ;
        for (i = 0; i < nums.length-1; i++) {
            for (j = i +1 ; j < nums.length; j++) {
                  if(nums [i] == nums [j]) {
                    break;
                }
            }
        }
        return nums[i];
    }
}
