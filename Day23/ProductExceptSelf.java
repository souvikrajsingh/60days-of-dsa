package com.souvik.Day23;

//https://leetcode.com/problems/product-of-array-except-self/
//got Time Limit Exceeded error: Time complexity is too high

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        int[] answer=productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;

        }
    }

    /*int [] answer =new int[nums.length];
    int pro=1;
        for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
        if(i!=j)
        {
        pro=pro*nums[j];
        answer[i] = pro;

        }
        }
        pro = 1;
        }
        return answer;*/

