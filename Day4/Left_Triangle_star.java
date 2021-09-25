package com.souvik.Day4;

import java.util.Scanner;
public class Left_Triangle_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r= sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
