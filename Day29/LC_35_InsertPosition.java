package com.souvik.Day29;

//https://leetcode.com/problems/search-insert-position/

public class LC_35_InsertPosition {

    public static void main(String[] args) {

        int[] nums = {1,3,5,6 };
        int target= 2;
        System.out.println(searchInsert(nums,target));


    }
    public static int searchInsert(int[] nums, int target) {


        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
            Memory Usage: 38.4 MB, less than 89.55% of Java online submissions for Search Insert Position.*/

        int s = 0;
        int e = nums.length - 1 ;

        while(s <= e)
        {
            int mid = s + (e-s) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                s=mid + 1;
            }
            else if (nums[ mid ] >target)
            {
                e= mid - 1;
            }

        }
        return s;  // or you can also return e+1;
    }
}
