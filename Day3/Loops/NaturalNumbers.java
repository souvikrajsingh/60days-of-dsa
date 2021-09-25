package com.souvik.Day3.Loops;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower Limit and the Upper Limit: ");
        int l= sc.nextInt();
        int u= sc.nextInt();
        sumofnaturalnums(l,u);
    }

    public static void sumofnaturalnums(int l, int u) {
        int sum=0;
        for(int i=l;i<=u;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum: " + sum);
    }
}
