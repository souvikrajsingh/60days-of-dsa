package com.souvik.Day15;

import java.util.Arrays;
import java.util.Scanner;

public class FibonnaciElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        System.out.println("Enter two numbers from the fibonacci series: ");
        int f=sc.nextInt();
        int s=sc.nextInt();
        fibonacciseries(arr,f,s);
        System.out.println("fibonacci array: "  + Arrays.toString(arr));
        System.out.println("Prime fibonacci elements: ");
        for (int i = 0; i < arr.length; i++) {
            checkprime(arr[i]);
        }
    }

    static void checkprime(int i) {
        int flag = 0;
        if (i !=0 || i != 1) {
            for (int j = 2; j < (i / 2); j++) {
                if ((i % j) == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
        }

    }
    static void fibonacciseries(int[] arr, int f, int s)
    {
        arr[0]=f;
        arr[1]=s;
        for (int i = 2 ; i < 20  ; i++) {
            arr[i]=f+s;
            f=s;
            s=arr[i];
        }
    }
}

