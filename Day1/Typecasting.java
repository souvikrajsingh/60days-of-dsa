package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        float num=sc.nextFloat();
//        System.out.println((int)num);

//        automatic type promotion in expression
        /*int a=257;
        byte b=(byte) (a); //257 % 256 = 1
        System.out.println(b);*/

        byte a=40;
        byte b=50;
        byte c=100;

        int d=(a*b)/c;
        System.out.println("नमस्ते");
//Java defines several type promotion rules that apply to expressions. They are as follows: First, all byte, short, and char values are promoted to int, as just described. Then, if one operand is a long, the whole expression is promoted to long. If one operand is a float, the entire expression is promoted to float. If any of the operands is double, the result is double.

    }
}
