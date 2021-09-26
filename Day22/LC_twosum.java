package com.souvik.Day22;

// 47/55 test cases passed
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class LC_twosum {
    public static void main(String[] args) {

        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        int[] arr = new int[2];
        arr = twoSum(nums, target);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] twoSum(int[] nums, int target) {

        int [] arr =new int [ 2 ];
        for (int i = 0; i < arr.length; i++) {

            if(i == (nums.length-1))
            {
                for (int j = 0; j < nums.length - 1; j++) {

                    if(nums[nums.length-1] + nums[j] == target)
                    {
                        arr[0]=j;
                        arr[1]=arr.length-1;
                        break;
                    }
                }
            }
            else
            {
                for (int j = (i+1); j < nums.length  ; j++) {

                    if((nums[i] + nums[ j])==target)
                    {
                        arr[0]=i;
                        arr[1]=j;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}

/*
* int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i == (nums.length - 1)) {
                for (int j = 0; j < nums.length -1; j++) {
                    if ((nums[nums.length - 1] + nums[j]) == target) {
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < nums.length - 1; j++) {
                    for (int k = (j + 1); k < nums.length; k++) {
                        if ((nums[j] + nums[k]) == target) {
                            arr[0] = i;
                            arr[1] = j;
                            break;
                        }
                    }
                }
            }
        }
        return arr;
*
* */



