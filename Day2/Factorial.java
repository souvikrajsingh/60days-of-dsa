package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Number: ");
        a= sc.nextInt();
        for(int i=a;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + a + " : " + fact);
    }
}
