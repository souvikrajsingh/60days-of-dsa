package com.souvik.Day31;

/*https://leetcode.com/problems/find-the-duplicate-number/ ( Passed 53 / 58 Test Cases )
ERROR : Time Limit Exceeded*/

public class LC_287_DuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5,  3, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        int i,j,pos = 0;

        for (i = 0; i < nums.length; i++) {
            if( i == nums.length - 1 )
            {
                return -1;
            }
            else
            {
                for (j = (i+ 1); j < nums.length; j++) {
                    if(nums[i] == nums[j])
                    {
                        return nums[j];
                    }
                }
            }
        }
        return -1;
    }
}









/*int k =0;
        int i;
        for (i = 0; i < nums.length; i++) {

            k = binarySearch(nums , i );

            if( k >= 2 )
            {
                break;
            }
        }
        return i;
    }

    public static int binarySearch(int[] nums, int i) {

        int start = 0;
        int end = nums.length-1;
        int c= 0;

        while( start <= end)
        {
            int mid = start + (end - start) / 2 ;

            if( nums[mid] == i )
            {
                c=c+1;
            }
            else if(nums[mid] < i )
            {
                start = mid + 1;

            }
            else if (nums[mid] > i)
            {
                end = end -1;
            }
        }
        return c;
    }
}
*/