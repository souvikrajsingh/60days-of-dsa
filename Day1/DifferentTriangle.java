package com.company;

import java.util.Scanner;

public class DifferentTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Area of Equilateral Triangle\n2.Area of Isosceles Triangle\n3.Area of Scalene Triangle");
        int choice=sc.nextInt();
        int a,b,c;
        double s;
        switch (choice)
        {
            case 1:
                System.out.print("Enter the side: ");
                a=sc.nextInt();
                System.out.println("Area of Equilateral Triangle: " + ((Math.pow(3,0.5)/4)*a*a) );
                break;
            case 2:
                System.out.println("Enter the two sides a and b: ");
                a= sc.nextInt();
                b= sc.nextInt();
                s=(0.25)*(b)*(Math.sqrt((4*b*b)-(a*a)));
                System.out.println(s);
                break;
            case 3:
                System.out.println("Enter the three sides a b and c: ");
                 a= sc.nextInt();
                 b= sc.nextInt();
                 c=sc.nextInt();
                s=(a+b+c)/2;
                System.out.println("Area: " +Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                break;
            default:
                System.out.println("INVALID INPUT");

        }
    }
}
