package com.company;

import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two num: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + ((a>b)?(a-b):(b-a)));
        System.out.println("Product : " + (a*b));
        System.out.println("Quotient : " + ((a>b)?(a/b):(b/a)));
        System.out.println("Remainder: " + ((a>b)?(a%b):(b%a)));
    }
}
