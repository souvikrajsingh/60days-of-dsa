package com.souvik.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_usingThird {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in first array: ");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
        System.out.println("Enter the number of elements in second  array: ");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        System.out.println("Enter elements in the array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter elements in the array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= sc.nextInt();
        }
        merging(arr1,arr2,size1,size2);
    }
    static void merging(int[]arr1,int[] arr2, int size1, int size2)
    {
        int[] arr3=new int[size1+ size2];
        int k=0;
        for (int i = 0; i < size1 + size2; i++) {
            if(i<size1) {
                arr3[i] = arr1[i];
            }
            else
            {
                arr3[i]=arr2[k];
                k=k+1;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

}
