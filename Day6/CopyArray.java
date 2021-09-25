package com.souvik.Day6;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        int[] a1=new int[5];
        int[] a2=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        for(i=0;i<a1.length;i++)
        {
            a1[i]= sc.nextInt();
        }
        System.out.println("Input in a1");
        System.out.println(Arrays.toString(a1));

        System.out.println("Input in a2 before ");
        System.out.println(Arrays.toString(a2));
        for(i=0;i<a1.length;i++)
        {
            a2[i]=a1[i];
        }

        System.out.println("After Copying a2");
        System.out.println(Arrays.toString(a2));

    }
}
