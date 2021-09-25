package com.souvik.Day5;

import java.util.Scanner;

public class Palindrome_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int r=reverse(n);
        if(r==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    static int reverse(int n)
    {
        int r=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        return r;
    }
}
