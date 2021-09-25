package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int r,rev=0,c=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reversed Number: " + rev);
        if(c==rev)
        {
            System.out.println("palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
