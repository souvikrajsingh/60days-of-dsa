package com.souvik.Day4;

import java.util.Scanner;

public class fullpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<r;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
