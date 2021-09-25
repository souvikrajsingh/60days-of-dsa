package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the Month number: " );
        int m= sc.nextInt();
        System.out.println("Input Year Number: ");
        int y= sc.nextInt();
        switch (m)
        {
            case 1:
                System.out.println("Jan "+y+": 31");
                break;
            case 2:
                if(y%4==0) {
                    System.out.println("Feb " + y + ": 29");
                }
                else
                {
                    System.out.println("Feb "+y+": 28");
                    break;
                }
                break;
            case 3:
                System.out.println("March "+y+": 31");
                break;
            case 4:
                System.out.println("April "+y+": 30");
                break;
            case 5:
                System.out.println("May "+y+": 31");
                break;
            case 6:
                System.out.println("June "+y+": 30");
                break;
            case 7:
                System.out.println("July "+y+": 31");
                break;
            case 8:
                System.out.println("August "+y+": 30");
                break;
            case 9:
                System.out.println("September"+y+": 31");
                break;
            case 10:
                System.out.println("October "+y+": 30");
                break;
            case 11:
                System.out.println("November "+y+": 31");
                break;
            case 12:
                System.out.println("December "+y+": 30");
                break;

        }
    }
}
