package com.company;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P,R, T");
        int P= sc.nextInt();
        int R= sc.nextInt();
        int T= sc.nextInt();
        System.out.println("Interest: " + (P*R*T)/100);
    }
}
