package com.souvik.Day4;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r= sc.nextInt();
        System.out.println("Increasing Star Pattern");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Decreasing Star Pattern");
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<r;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
