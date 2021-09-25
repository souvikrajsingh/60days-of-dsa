package com.souvik.Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DifferenceFibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        System.out.println("Length of the array " + arr.length);
        ArrayList<Integer>list=new ArrayList<>(20);
        System.out.println("Enter two numbers from the fibonacci series: ");
        int f=sc.nextInt();
        int s=sc.nextInt();
        fibonacciseries(arr,f,s);
        System.out.println("fibonacci array: "  + Arrays.toString(arr));
        for (int i = 0; i < 19; i++) {
            list.add((arr[i+1]-arr[i]));
        }
        System.out.println("Consecutive differences : "  + list);

    }
    static void fibonacciseries(int[] arr, int f, int s)
    {
        arr[0]=f;
        arr[1]=s;
        for (int i = 2 ; i < 20  ; i++)
        {
            arr[i]=f+s;
            f=s;
            s=arr[i];
        }
    }
}
