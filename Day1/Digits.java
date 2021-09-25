package com.company;
//sum of the first and the last digit of the 3-digit number
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n= sc.nextInt();
        int rem,sum=0;

        System.out.println("Sum of digits: " + ((n%10)+(n/100)));
    }
}
