package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers be it positive or negative but on entering zero the loop would be terminate");
        int pos=0;int neg=0;int n;
        do{
            System.out.print("Enter Number: ");
            n=sc.nextInt();
            if(n>0)
            {
                pos=pos+1;
            }
            else
            {
                neg=neg+1;
            }
        }
        while(n!=0);
        System.out.println("Number of Positive Numbers entered: " + pos);
        System.out.println("Number of Negative Numbers entered: " + neg);

    }
}
