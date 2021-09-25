package com.company;

import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value1,value2;
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r= sc.nextInt();
        value1=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("nCr: " + value1);
        value2=factorial(n)/(factorial(n-r));
        System.out.println("nPr: " + value2);
    }
    public static int factorial(int n)
    {
        int sum=1;
        for(int i=n;i>0;i--)
        {
            sum=sum*i;
        }
        return sum;
    }
}
