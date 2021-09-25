package com.souvik.Day14;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
        }
        System.out.println("Enter the position at which you want to delete element: ");
        int pos= sc.nextInt();
        deletion(arr,size,pos);

    }
    static void deletion(int[] arr, int size, int pos)
    {
        if (pos >=0 &&pos<=(size)) {
            for(int i=pos-1;i<(size)-1;i++)
            {
                arr[i]=arr[i+1];
            }
            size=size-1;
        }
        else
        {
            System.out.println("INVALID, Position out of range");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
