package com.souvik.Day11;

/*

https://leetcode.com/problems/find-smallest-letter-greater-than-target/

 */

public class LC_744 {

    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;

        int end=letters.length-1;

        while(start<=end)
        {
            //find the middle element
            //int mid=(start+end)/2;chances are the start + end might exceed the range of int

            int mid=start+(end-start)/2;

            if(target<letters[mid])
            {
                end=mid-1;
            }
            else
            {

                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}


    /*static int binarySearch(int[] letters,int target)
    {
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            //find the middle element
            //int mid=(start+end)/2;chances are the start + end might exceed the range of int

            int mid=start+(end-start)/2;

            if(target<letters[mid])
            {
                end=mid-1;
            }
            else if(target>letters[mid])
            {

                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}

}*/
