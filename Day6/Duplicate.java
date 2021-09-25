package com.souvik.Day6;

import java.util.Scanner;

public class Duplicate
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int i;int j;
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Duplicate Elements: ");
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]  +  " ");
                }
            }
        }

    }
}
