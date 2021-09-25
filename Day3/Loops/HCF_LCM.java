package com.souvik.Day3.Loops;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int x=a,y=b;
        int lcm;
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else if(b>a)
            {
                b=b-a;
            }
        }
        lcm=(x*y)/a;
        System.out.println("HCF: " + a);
        System.out.println("LCM: " + lcm);

    }
}
