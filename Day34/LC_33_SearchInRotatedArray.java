package com.souvik.Day34;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class LC_33_SearchInRotatedArray {

    public static void main(String[] args) {

        int [] nums = { 3,4,5,6,0,1,2};
        int target = 7 ;
        System.out.println(search(nums,target));

    }
    public static int search(int[] nums, int target) {

        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
        Memory Usage: 38.3 MB, less than 77.96% of Java online submissions for Search in Rotated Sorted Array.*/

        int pivot = findpivot(nums);

        if( pivot == -1 )
        {
            return binarySearch(nums, target, 0 , nums.length - 1 );
        }

        if( nums[pivot] == target)
        {
            return pivot;
        }

        if( target > nums[0])
        {
            return binarySearch(nums , target , 0 , pivot-1);
        }

            return binarySearch( nums , target, pivot +1 , nums.length- 1 );

    }

    private static int binarySearch(int[] nums, int target, int start, int end) {

        while(start<=end)
        {
            //find the middle element
            //int mid=(start+end)/2;chances are the start + end might exceed the range of int

            int mid=start+(end-start)/2;

            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {

                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static int findpivot(int [] nums)
    {
        int pivot = -1;
        int s = 0;
        int e = nums.length - 1 ;

        while(s<=e)
        {
            int mid = s + (e-s) /2 ;
            if( mid < e && nums[mid] > nums[mid + 1])
            {
                return mid;
            }
            else if(mid > s && nums[mid] < nums[mid - 1])
            {
                return mid - 1;
            }
            else if( nums[s] >=nums[mid])
            {
                e = mid - 1;
            }
            else if(nums[s]< nums[mid])
            {
                s= mid + 1;
            }
        }
        return pivot;
    }
}

