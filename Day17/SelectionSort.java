package com.souvik.Day17;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= { 5,3,4,1,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
//            find the max element in the remaining array and swap with the correct index
                int last=arr.length-i-1;
                int maxIndex =getmaxindex(arr, 0 , last);

                swap(arr, maxIndex,last);
        }
    }

    private static int getmaxindex(int[] arr, int start , int end) {
        int max=start;

        for (int i = 0; i <= end; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            }

        }
        return max;
    }
    private static void swap(int[] arr, int j, int i) {
        int temp;

        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }
}
