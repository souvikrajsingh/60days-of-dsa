package com.souvik.Day14;

import java.util.Scanner;

public class InsertionElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[50];
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        if(size>50)
        {
            System.out.println("overflow condition");
        }
        else {
            System.out.println("Enter the elements in the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the position at which you want to enter a element: ");
            int pos = sc.nextInt();
            System.out.println("Enter the number you want to put: ");
            int num = sc.nextInt();
            insertionelement(arr, size, pos, num);
        }
    }
    static void insertionelement(int[] arr, int size, int pos, int num)
    {

            for(int i=size-1;i>=pos-1;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[pos-1]=num;
            size=size+1;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }

