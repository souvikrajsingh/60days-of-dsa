package com.souvik.Day6;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    static void insertelement(int[] a , int element, int pos,int size)
    {
        for(int i=size;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=element;
//        size++;
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] a=new int[size+1];
        int i;
        System.out.println("Enter the elements in the array: ");
        for(i=0;i< a.length-1;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Input: ");
        System.out.print(Arrays.toString(a));
        System.out.println("Enter the element to enter: ");
        int element= sc.nextInt();
        System.out.println("Enter the position you want the element to be inserted at: ");
        int pos=sc.nextInt();
        insertelement(a,element,pos,size);

    }
}
