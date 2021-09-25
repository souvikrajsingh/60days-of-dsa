package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        int a,b;
        do{
            System.out.println("Enter two numbers : ");
             a= sc.nextInt();
             b= sc.nextInt();
            System.out.println("Sum of " + a + " and "+b +" :" + sumoftwonums(a,b));
            System.out.println("Enter Y to continue and find sum of more such numbers \nEnter N to terminate the program");
            ch=sc.next().charAt(0);
        }
        while(ch!='N');

    }

    static int  sumoftwonums(int a, int b) {
        int sum=a+b;
        return sum;
    }
}
