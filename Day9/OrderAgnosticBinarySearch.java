package com.souvik.Day9;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int[] arr = {96,75,18,22,6,4,3,2,0,-2,-4,-6};
        int target = 22;

        int ans = orderagnosticbinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderagnosticbinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            //find the middle element
            //int mid=(start+end)/2;chances are the start + end might exceed the range of int

            int mid = start + (end - start) / 2;


            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {

                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {

                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}





