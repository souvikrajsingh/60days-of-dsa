package com.souvik.Day31;


//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class LC_852_PeakInMountain {

    public static void main(String[] args) {

        int[] arr = {0,10,5,2};
        System.out.println(arr[peakIndexInMountainArray(arr)]);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
        Memory Usage: 39.1 MB, less than 77.30% of Java online submissions for Peak Index in a Mountain Array.*/

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }

        }
        return s;
    }
}
