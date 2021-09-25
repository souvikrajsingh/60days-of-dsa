package com.souvik.Day3;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int rem, max = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem > max) {
                max = rem;
                System.out.println(max);
            }
            n = n / 10;
        }
    }
}

