package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the lower limit: ");
            int l= sc.nextInt();
            System.out.println("Enter the higher limit: ");
            int h= sc.nextInt();
            for(int i=l;i<=h;i++)
            {
                int f=checkarmstrong(i);
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

    static int checkarmstrong(int i) {
        int r, sum=0;
        int c=i;
        while(i>0)
        {
            r=i%10;
            sum=sum+(int)Math.pow(r,3);
            i=i/10;
        }
        if(c==sum)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
