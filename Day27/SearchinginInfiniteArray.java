package com.souvik.Day27;


/*searching in a infinite array, here we assume that the size of the array is infinite, what the questions wants to
tell us is we can't use the arr.length function. Simple*/


public class SearchinginInfiniteArray {

    public static void main(String[] args) {

        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr , target));

    }

    public static int ans(int[]  arr , int target)
    {
//        start with the box of size 2
        int start = 0;
        int end= 1;

//        condition

        while( target > arr [end])
        {
            int newStart = end+1 ;
//          double the box
//          new end = end(index)  +  ( 2 * size of box )
            end = end +  (end - start + 1 ) * 2;

            start = newStart;

        }
        return binarySearch(arr,target,start,end);

    }

    static int binarySearch ( int [] arr , int target , int start , int end)
    {
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
        return -1;
    }
}
