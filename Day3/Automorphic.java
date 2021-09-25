package com.souvik.Day3;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number you want to check: ");
        int n= sc.nextInt();
        int sq=n*n;
//        System.out.println("Square: " + sq);

        int c=numberofdigits(n);
//        System.out.println("No of digits: " + c);

//        System.out.println("sq%c: " + (sq%(int)Math.pow(10,c)));
        if((sq%(int)Math.pow(10,c))==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }

    }
    static int numberofdigits(int n)
    {
        int c=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            c=c+1;
        }
        return c;
    }
}
