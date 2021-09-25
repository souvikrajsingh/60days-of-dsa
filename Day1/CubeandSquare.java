package com.company;

import java.util.Scanner;

public class CubeandSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Square of " + i + " : " + i*i);
            System.out.println("Cube of " + i + " : " + i*i*i);
            System.out.println();

        }

    }
}
