package com.souvik.Day28;

//https://leetcode.com/problems/valid-perfect-square/

public class LC_367_PerfectSquare {

    public static void main(String[] args) {

        boolean perfect = isPerfectSquare(808201);
        System.out.println(perfect);
    }

    public static boolean isPerfectSquare(int num) {

        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
Memory Usage: 35.9 MB, less than 45.96% of Java online submissions for Valid Perfect Square.*/

        if(num < 2)
        {
            return true;
        }
        else {
            long s = 2;
            long e = num / 2;
            while (s <= e) {
                long mid = s + (e - s) / 2;
                if ((mid * mid) == num) {
                    return true;
                } else if ((mid * mid) > num) {
                    e = mid - 1;

                } else if ((mid * mid) < num) {
                    s = mid + 1;

                }
            }
        }
        return false;
    }
}

        /*
        Brute -Force Approach
        if(num < 2 )
        {
            return true;
        }
        else {
            for (int i = 2; i <= num / 2; i++) {
                if ((i * i) == num) {
                    return true;
                }

            }
            return false;
        }
    }
}*/



