package com.company;

import java.util.Scanner;
//import java.util.*;

public class ScaleneTriangle
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides a b and c: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        double s=(a+b+c)/2;
        System.out.println("Area: " +Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
