package com.souvik.Day6;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int i,pos;
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the elements");
        for(i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the index of the element you want to remove : ");
        pos= sc.nextInt();
        for(i=pos;i< arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println("After removing the asked element New Array: ");
        for(i=0;i< arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
