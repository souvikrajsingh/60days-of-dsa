package com.company;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.next();
        System.out.println("hey " +name + " I hope you're having a good day");
    }
}
