package com.souvik.Day23;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public static int firstMissingPositive(int[] nums) {

        int min=nums[0];
        int max=nums[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            else if(nums[i]<min)
            {
                min=nums[i];
            }
        }

        for (int i = min; i < max; i++) {
            {
                for (int j = (); j < ; j++) {

                }
            }

        }

    }

}
