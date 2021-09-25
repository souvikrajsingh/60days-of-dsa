package com.souvik.Day2;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number you want to check: ");
        int n= sc.nextInt();
        int rem,sum=0;int c=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+factorial(rem);
            n=n/10;
        }
//        System.out.println("Sum: "+ sum);
        if(sum==c)
        {
            System.out.println("Special Number");
        }
        else
        {
            System.out.println("Not Special Number");
        }
    }
    public static int factorial(int a)
    {
        int sum=1;
        for(int i=a;i>0;i--)
        {
            sum=sum*i;
        }
        return sum;
    }
}
