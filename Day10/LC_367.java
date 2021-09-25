package com.souvik.Day10.Revision;


import java.util.Scanner;

// Valid Perfect Square
public class LC_367 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num= sc.nextInt();
        boolean k= isPerfectSquare(num);
        System.out.println(k);

    }
    public static boolean isPerfectSquare(int num)
    {
        for(int i=1;i<(num/2);i++) {
            if ((i * i) != num) {
                break;
            }
        }
        return true;
    }
}
