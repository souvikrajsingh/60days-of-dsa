package com.souvik.Day5;

import java.util.Scanner;

public class SumusingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        sum(a,b);

    }
    static void sum(int a, int b)
    {
        System.out.println("Sum : " + (a+b));
    }
}
