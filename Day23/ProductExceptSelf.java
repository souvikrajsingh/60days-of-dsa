package com.souvik.Day23;

//https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        int[] answer=productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] productExceptSelf(int[] nums) {

        int [] answer =new int[nums.length];
        int k=0,pro=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j)
                {
                    continue;
                }
                else
                {
                        pro=pro*nums[j];
                        answer[k] = pro;

                    }
                }
            pro = 1;
            k = k + 1;
            }
        return answer;
        }
    }
    /*int [] answer =new int[nums.length];
        int k=0,pro=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j)
                {
                    continue;
                }
                else
                {
                        pro=pro*nums[j];
                        answer[k] = pro;

                    }
                }
            pro = 1;
            k = k + 1;
            }
        return answer;*/


