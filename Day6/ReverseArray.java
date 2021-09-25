package com.souvik.Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        int size;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Input Array: "  + Arrays.toString(arr));
        reversearray(arr);
        
    }

    static void reversearray(int[] arr)
            {
                System.out.println("Reversed Array: ");
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
