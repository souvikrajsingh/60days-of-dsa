package com.company;

import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==b&&a==c)
        {
            System.out.println("All the three numbers are equal");

        }else if(a>b&&a>c)
        {
            if(b>c)
            {
                System.out.println("Second greatest: " + b);
            }
            else
            {
                System.out.println("Second Greatest : " + c);
            }
        }
        else if (b>a&&b>c)
        {
            if(a>c)
            {
                System.out.println("Second Greatest: " + a);
            }
            else
            {
                System.out.println("Second Greatest: " + c);
            }
        }
        else if(c>a&&c>b)
        {
            if(a>b)
            {
            System.out.println("Second Greatest " + a);
            }
            else {  System.out.println("Second Greatest " +b );
}}}}