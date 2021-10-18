package com.souvik.Day35;


//https://leetcode.com/problems/shuffle-string/

public class LC_1528_ShuffleString {

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = { 4,5,6,7,0,2,1,3 };
        String sorted = restoreString(s, indices);
        System.out.println(sorted);
    }

    public static String restoreString(String s, int[] indices) {


        /*Runtime: 1 ms, faster than 99.98% of Java online submissions for Shuffle String.
        Memory Usage: 39.3 MB, less than 60.93% of Java online submissions for Shuffle String.*/

        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[indices[i]]=s.charAt(i);
        }

        return String.valueOf(arr);
    }
}
