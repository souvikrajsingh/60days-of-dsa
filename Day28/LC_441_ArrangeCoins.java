package com.souvik.Day28;

//https://leetcode.com/problems/arranging-coins/

public class LC_441_ArrangeCoins {
    
    public static void main(String[] args) {

        System.out.println(arrangeCoins(4));

    }
    public static int arrangeCoins(int n) {

        /*Runtime: 1 ms, faster than 100.00% of Java online submissions for Arranging Coins.
          Memory Usage: 36.4 MB, less than 49.28% of Java online submissions for Arranging Coins.*/

        long s = 1;
        long e = n;

        while( s <= e)
        {
            long mid = s + (e-s) / 2;
            long sum = (mid * (mid + 1))/2;
            if(sum == n)
            {
                return (int)mid;
            }
            else if(sum>n)
            {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return (int)e;
    }
    
}
