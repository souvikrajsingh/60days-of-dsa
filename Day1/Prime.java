package com.company;

import java.util.Scanner;
public class Prime
{
    public static void main(String[] args) {
        int a;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("Neither composite not prime");
        }
        else
        {
            for (i = 2; i < (a / 2); i++) ;
            {
                if (a % i == 0) {
                    System.out.println("Not Prime");
                }
                else
                {
                    System.out.println("prime");
                }
            }
        }
    }
}
