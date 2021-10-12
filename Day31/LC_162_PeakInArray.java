package com.souvik.Day31;

//https://leetcode.com/problems/find-peak-element/



public class LC_162_PeakInArray {

    public static void main(String[] args) {

        int[] nums = { 1 ,2,3,1};
        System.out.println(findPeakElement(nums));

    }
    public static  int findPeakElement(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    public static int helper(int[] num,int start,int end){

        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
        Memory Usage: 38.4 MB, less than 90.01% of Java online submissions for Find Peak Element.*/


        if(start == end){
            return start;
        }
        else if(start+1 == end)
        {
            if(num[start] > num[end]) return start;
            return end;
        }
        else
        {
            int m = (start+end)/2;

            if(num[m] > num[m-1] && num[m] > num[m+1]){

                return m;

            }
            else if(num[m-1] > num[m] && num[m] > num[m+1])
            {

                return helper(num,start,m-1);

            }
            else{

                return helper(num,m+1,end);
            }
        }
    }



    /*

Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
Memory Usage: 39.9 MB, less than 19.98% of Java online submissions for Find Peak Element.

    int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }*/
}

