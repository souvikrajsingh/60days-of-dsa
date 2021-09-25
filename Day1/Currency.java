package com.company;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter currency in INR: ");
        int INR= sc.nextInt();
        System.out.println(INR + " in dollars: " + INR/74.20);
    }
}
