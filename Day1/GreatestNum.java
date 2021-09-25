package com.company;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a==b&&a==c)
        {
            System.out.println("All the three numbers are equal");

        }
        else if (a>b&&a>c)
        {
            System.out.println(a + " is the greatest");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b+ " is the greatest");
                    }
        else if(c>a&&c>b)
         {
             System.out.println(c + " is the greatest");
        }
    }
}
