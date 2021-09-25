package com.souvik.Day8;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;
class Solution {
    public static int findNumbers(int[] nums) {
        int c=0;
        for(int num: nums)
        {
            if(even(num))
            {
                c++;
            }
        }
        return c;
    }
    public static boolean even(int num) {
        int noOfDigits =digits(num);
        /*
        if(noOfDigits % 2 == 0)
        {
            return true;
        }*/
        return noOfDigits %2 ==0;

    }

    public static int digits(int num ){
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0;i<5;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(findNumbers(nums));
    }

}
