package com.souvik.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        bubblesort(arr);
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr)
    {
        int i,j;
        for(i=0;i< arr.length;i++)
        {
            boolean swapped=false;
            for(j=1;j< arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
