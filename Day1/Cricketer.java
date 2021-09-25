package com.company;

import java.util.Scanner;

public class Cricketer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of runs and wickets");
        int r=sc.nextInt();
        int w= sc.nextInt();
        if(r>40&&w>3)
        {
            System.out.println("All rounder");

        }
        else if(r>50&&w==0)
        {
            System.out.println("Batsman");
        }
        else if(r==0&&w>4)
        {
            System.out.println("Bowler");
        }
        else
        {
            System.out.println("Wicket keeper / Fielder");
        }

    }
}
