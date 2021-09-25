package com.souvik.Day6;

import java.util.Scanner;

public class MaxMin {
    static void maxmin(int[] arr)
    {
        int max=arr[0];
        int min=arr[0];
        for(int c:arr)
        {
            if(c>max)
            {
                max=c;
            }
        }
        for(int c:arr)
        {
            if(c<min)
            {
                min=c;
            }
        }
        System.out.print("Maximum element : "  + max);
        System.out.println("Minimum element : "  + min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner( System .in);
        System.out.print("Enter the size of the array: ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        int i;
        System.out.println("Enter the elements in the array: ");
        for (i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        maxmin(arr);
    }
}
