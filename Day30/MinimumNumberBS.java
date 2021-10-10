package com.souvik.Day30;

public class MinimumNumberBS {

    public static void main(String[] args) {

        int[] arr = { 3,4,5,6,7,8,9,10};
        int min = findMin(arr , arr[0]);
        System.out.println(min);

    }

    public int findMin(int[] nums) {

        int s= 0;
        int e= nums.length - 1;

        if(s==e)
        {
            return nums[0];
        }
        int mid= s + ( e-s) / 2;

        if( mid<e && nums[mid + 1]< nums[mid] )
        {
            return nums[mid + 1];

        }
        if( mid > e  && nums[mid] < nums[mid - 1])
        {
            return nums[mid];
        }

        while( s <= e)
        {
            if (nums[e] > nums[mid])
            {
                e = mid -1 ;
            }
            else if(nums[e] <nums [mid] )
            {
                s= mid +1;
            }
        }
    }
}
