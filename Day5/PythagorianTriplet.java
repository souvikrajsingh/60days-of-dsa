package com.souvik.Day5;

import java.util.Scanner;

public class PythagorianTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a, b and c");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        check(a,b,c);

    }

    static void check(int a, int b, int c) {
        if(((a*a)+(b*b))==(c*c))
        {
            System.out.println("Pythagorian Triplet");
        }
        else
        {
            System.out.println("Not Pythagorian Triplet");
        }
    }
}
