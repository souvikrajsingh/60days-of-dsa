package com.souvik.Day21;

import java.util.ArrayList;
import java.util.List;

public class LC_1431 {
    public static void main(String[] args) {
        /*
        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
        */
        int[] candies= { 2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> list=new ArrayList<>();
        list=kidsWithCandies(candies,extraCandies);
        System.out.println(list);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=checkmax(candies);
        List<Boolean> list=new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            candies[i]=candies[i]+ extraCandies;
            if(candies[i]>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }

    private static int checkmax(int[] candies) {
        int max=candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        return max;
    }

    /*
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max=candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }

        List<Boolean> list=new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
                list.add(candies[i]+ extraCandies>=max);
            }
        return list;
    }*/
}
