package com.souvik.Day8;

//https://leetcode.com/problems/richest-customer-wealth/submissions/

public class LC_Maxwealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;

        for(int person=0;person<accounts.length;person ++)
        {
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum=sum+accounts[person][account];

            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}
