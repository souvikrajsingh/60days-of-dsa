package com.souvik.Day10.Revision;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements in the array : ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target= sc.nextInt();
        int pos=linearSearch(arr,target);
        System.out.println("Yes " + target + " present at " + (pos+1) );
    }
    public static int linearSearch(int a[],int target)
    {
        int pos=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
}
