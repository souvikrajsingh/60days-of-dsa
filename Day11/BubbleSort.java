package com.souvik.Day11;

public class BubbleSort {
    public static void main(String[] args) {

    }
    static void bubblesort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
        // if you did not swap for a particular value of i, it means the array is sorted
            if(!swapped) //!false=true;
            {
                break;
            }
        }
    }
}
