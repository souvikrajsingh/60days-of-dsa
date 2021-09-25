package com.souvik.Day5;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
        min(a, b, c);
    }

    static void max(int a, int b, int c) {
        int max = a;
        if (a > b && a > c) {
            max = a;
        } else if (b > max && b > a && b > c) {
            max = b;
        } else if (c > max && c > a && c > b) {
            max = c;
        }
        System.out.println("Max: " + max);
    }

    static void min(int a, int b, int c) {
        int min = a;
        if ( a < b && c > a) {
            min = a;
        } else if (b > min && b > a && b > c) {
            min = b;
        } else if (c > min && c > a && c > b) {
            min = c;
        }
        System.out.println("Min: " + min);
    }
}