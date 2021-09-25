package com.souvik.Day13;

import java.util.Scanner;

public class Binary_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the search element : ");
        int search= sc.nextInt();
        int pos=binarysearch(arr,search);
        if(pos==-1)
        {
            System.out.println("Element not found . ");
        }
        else {
            System.out.println("Element found at position : " + (pos + 1));
            checkoddeven(arr[pos]);
        }
    }

    private static int  binarysearch(int[] arr, int search) {

        int s=0;
        int e= arr.length-1;
        int pos=0;

        for (int i = 0; i < arr.length; i++) {
            int mid=(s+e)/2;
            if(arr[mid]==search)
            {
                return mid;

            }
            else if(arr[mid]<search)
            {
                e=mid-1;
            }
            else if(arr[mid]>search)
            {
                s=mid+1;
            }
        }
        return -1;
    }

    private static void checkoddeven(int i) {
        if(i%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
