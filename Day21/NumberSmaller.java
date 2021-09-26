package com.souvik.Day21;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class NumberSmaller {
    public static void main(String[] args) {
    int [] nums = { 8,1,2,2,3};
    int [] arr=new int[5];
    arr=smallerNumbersThanCurrent(nums);
    System.out.println(Arrays.toString(arr));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        int c=0;
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (nums[i] > nums[j] && (i != j)) {
                    c = c + 1;
                }
            }
            arr[k]=c;
            c=0;
            k=k+1;
        }

        /*
        Shortened Method

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j]&&j!=i)
                {
                    count=count+1;
                }
                arr[i]=count;
            }
        }
        */


        return arr;
    }
}
