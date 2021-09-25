package com.souvik.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        insertionsort(arr);
        System.out.println("Sorted Array : " + (Arrays.toString(arr)));
    }

        static void insertionsort(int [] arr)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1; j > 0 ; j--)
                {
                    if(arr[j]<arr[j-1])
                    {
                        swap(arr , j ,j-1);
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    private static void swap(int[] arr, int j, int i) {
        int temp;

        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;

    }
}
