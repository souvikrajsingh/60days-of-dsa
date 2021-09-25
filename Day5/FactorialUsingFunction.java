package com.souvik.Day5;

import java.util.Scanner;

public class FactorialUsingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();
        int f=factorial(n);
        System.out.println("Factorial of " +n+" : " + f);
    }
    static int factorial(int n)
    {
        int fact=1;
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}
