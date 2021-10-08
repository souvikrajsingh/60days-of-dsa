package com.souvik.Day29;

//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class LC_540_AppearedOnce {

    public static void main(String[] args) {

        int[] nums = { 1,1,3,3,4,4,2,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {


        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Element in a Sorted Array.
        Memory Usage: 39.1 MB, less than 59.18% of Java online submissions for Single Element in a Sorted Array.*/

        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}
    /*binary search

        int start = 0,end = nums.length-1;
        while(start < end)
        {
            int mid = start + (end-start)/2;
            if(mid % 2 == 1)
                mid--;

            if(nums[mid] != nums[mid+1])
                end = mid;
            else start = mid+2;
        }
        return nums[start];

  */
