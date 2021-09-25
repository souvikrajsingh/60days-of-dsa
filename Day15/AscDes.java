package com.souvik.Day15;

import java.util.Arrays;
import java.util.Scanner;

public class AscDes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int size1=sc.nextInt();
        System.out.println("Enter the size of second array: ");
        int size2=sc.nextInt();
        int[] arr1=new int[size1];
        int[] arr2=new int[size2];
        int[] merged_array=new int[size1+size2];
        System.out.println("Enter elements in the first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter elements in the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
        }
        sortasc(arr1);
        sortdes(arr2);
        int k=0;
        for (int i = 0; i < size1 + size2; i++) {
            if(i<size1) {
                merged_array[i] = arr1[i];
            }
            else
            {
                merged_array[i]=arr2[k];
                k=k+1;
            }
        }
        System.out.println(Arrays.toString(merged_array));

    }

    private static void sortasc(int[] arr1)
    {
        for (int i = 0; i < arr1.length; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr1.length-i ; j++) {
                if(arr1[j]<arr1[j-1])
                {
                    swap(arr1 , j ,j-1);
                    swapped=true;
                }

            }
            if(!swapped)
            {
                break;
            }
        }
    }

    private static void sortdes(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr2.length-i ; j++) {
                if(arr2[j]>arr2[j-1])
                {
                    swap(arr2 , j ,j-1);
                    swapped=true;
                }

            }
            if(!swapped)
            {
                break;
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
