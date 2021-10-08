package com.souvik.Day29;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class LC_1351_Negativenumbers {

    public static void main(String[] args) {

        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};

        System.out.println(countNegatives(grid));

    }
    public static int countNegatives(int[][] grid) {


        /*Runtime: 1 ms, faster than 46.63% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
         Memory Usage: 39.4 MB, less than 57.57% of Java online submissions for Count Negative Numbers in a Sorted
         Matrix.*/

        int c= 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] <0)
                {
                    c=c+1;
                }
            }
        }

        return c;
    }
}
