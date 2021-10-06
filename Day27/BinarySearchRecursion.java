package com.souvik.Day27;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();

        if(size>0) {
            int[] arr = new int[size];
            int k;
            int s = 0;
            int e = arr.length - 1;
            System.out.println("Enter the elements in the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the Target: ");
            int target = sc.nextInt();
            k = binarysearch(arr, target, s, e);
            System.out.println("Element found at Position : " + (k+1));
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    private static int binarysearch(int[] arr, int target, int s, int e) {


        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]>target)
        {
            return binarysearch(arr,target,s,mid-1);
        }

            return binarysearch(arr,target,mid+1,e);

        /*int mid = 0;
        while(s<e)
        {
            mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                break;
            }
            else if (arr[mid]>target)
            {
                return binarysearch(arr,target,s,mid-1);
            }
            else if(arr[mid]<target)
            {
                return binarysearch(arr,target,mid+1,e);
            }
        }
        return mid;*/
    }
}
