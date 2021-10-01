package com.souvik.Day25;

//this question came in Amazon

import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();

        int base =5;
        int ans=0;
        while(n>0)
        {
            int last=n&1;
            ans=ans+(last*base);
            n=n>>1;
            base=base*5;
        }

        System.out.println( ans);
    }
}
