package com.souvik.Day34;


//https://leetcode.com/problems/median-of-two-sorted-arrays/

//720 / 2094 test cases passed.(get back to it)

import java.util.Arrays;

public class LC_4_MedianOfArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 6, 5};
        int[] nums2 = {3, 2, 4};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median:  " + median);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median;
        int[] merged = mergedandsort(nums1, nums2);
        System.out.println(Arrays.toString(merged));

        if (merged.length % 2 == 0) {
            median = (merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2;
        } else {
            median = merged[merged.length / 2];
        }
        return median;
    }

    public static int[] mergedandsort(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];
        int k = 0;
        int tem = 0;

        for (int i = 0; i < (nums1.length + nums2.length); i++) {

            if (i < nums1.length) {
                merged[i] = nums1[i];
            } else {
                merged[i] = nums2[k];
                k = k + 1;
            }
        }

        int i,j;
        for(i=0;i< merged.length;i++)
        {
            boolean swapped=false;
            for(j=1;j< merged.length-i;j++)
            {
                if(merged[j]<merged[j-1])
                {
                    int temp=merged[j];
                    merged[j]=merged[j-1];
                    merged[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        return merged;
    }
}

