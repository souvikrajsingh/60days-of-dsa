package com.souvik.Day10.Revision;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target elements : ");
        int target = sc.nextInt();
        int j=orderagnosticbinarsearch(arr,target);
        if(j==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at : " + (j+1));
        }
    }
    public  static int orderagnosticbinarsearch(int[] arr , int target)
    {
        boolean isAsc=arr[0]<arr[arr.length-1];
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return  mid;
            }

            if(isAsc)
            {
                if(arr[mid]>target)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else{
                if(arr[mid]<target)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}

