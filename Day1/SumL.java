package com.company;

import java.util.Scanner;

public class SumL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number (0 will terminate the loop: ");
        int n=sc.nextInt();
        int sum=0;
        do
        {
            sum=sum+n;
            System.out.println("Enter another one: ");
            n= sc.nextInt();
        }
        while(n!=0);
        System.out.println("Sum : " + sum);
    }
}
