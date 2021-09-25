package com.souvik.Day8;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int f=0,c=0;
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Input" + Arrays.toString(arr));
        for(int i=0;i<size;i++)
        {
            f=tocheck(arr[i]);
            if(f==1)
            {
                c=c+1;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Number of nos. with even digits: " + c);
    }

    static int tocheck(int i) {
        int rem,count=0;
        while(i>0)
        {
            rem=i%10;
            count=count+1;
            i=i/10;
        }
        if(count%2==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
