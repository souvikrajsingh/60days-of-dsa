package com.souvik.Day28;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class LC_167_TargetIndices {

    public static void main(String[] args) {

        int [] numbers = { 2,7,11,15 };
        int target = 9 ;
        int [] arr =new int[2];
        arr=twoSum(numbers,target);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] twoSum(int[] numbers, int target) {

        /*Runtime: 239 ms, faster than 6.29% of Java online submissions for Two Sum II - Input array is sorted.
Memory Usage: 39 MB, less than 79.19% of Java online submissions for Two Sum II - Input array is sorted. */

        int[] arr = { -1, -1 };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                if(numbers[i] + numbers[ j] == target)
                {
                    arr[0]=i + 1;
                    arr[1]=j + 1 ;
                    return arr;
                }
            }
        }
        return arr;
    }

}
