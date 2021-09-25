package com.company;

import java.util.Scanner;

public class Armstrong {
    public static int checkarmstrong(int n)
    {
        int rem,sum=0,c=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==c) {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=0;
        System.out.println("Enter the starting point: ");
        int s=sc.nextInt();
        System.out.println("Enter the ending point");
        int e= sc.nextInt();
        for(int i=s;i<=e;i++)
        {
            f=checkarmstrong(i);
            if(f==1)
            {
                System.out.println(i);
            }
            else
            {
                continue;
            }
        }
    }
}
