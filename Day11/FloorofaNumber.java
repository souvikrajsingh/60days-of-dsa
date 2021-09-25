package com.souvik.Day11;



/* floor of a number

int[] arr= { 2,4,6,8,9,12,18,25,27}

floor of 5 = 4 ;

floor of 6 = 6;

floor of 13 = 12;

floor of a number is the greatest number smaller or equal to the target number



 NOTE: Condition is violated at s=e+1;
 for arr s=8+1
         s=9;  ( length of the array ) ;


* */


public class FloorofaNumber {

    public static void main(String[] args) {

        int[] arr= { -18, -12, -4 , 0 , 2,3,4,15,16,18,22,45};
        int target=10;
        int ans=binarySearch(arr,target);
        System.out.println(arr[ans]);
    }
    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //find the middle element
            //int mid=(start+end)/2;chances are the start + end might exceed the range of int

            int mid=start+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {

                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
