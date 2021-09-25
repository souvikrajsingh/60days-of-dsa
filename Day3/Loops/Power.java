package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int pro=1;
        System.out.println("Enter a Number: ");
        int n=console.nextInt();
        System.out.println("Enter the power you want it to be raised to");
        int p= console.nextInt();
        for(int i=1;i<=p;i++)
        {
            pro=pro*n;
        }
        System.out.println(n + " raised to the power "+p+" : " + pro);
    }
}
