package com.souvik.Day35;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class LC_1704_Alike {

    public static void main(String[] args) {

        String s = "AbCdEfGh";
        System.out.println(halvesAreAlike(s));

    }

    public static boolean halvesAreAlike(String s) {

        /*Runtime: 6 ms, faster than 36.20% of Java online submissions for Determine if String Halves Are Alike.
        Memory Usage: 39 MB, less than 32.89% of Java online submissions for Determine if String Halves Are Alike.*/

        int mid = s.length() /  2;
        String a = (s.substring(0 , mid).toLowerCase());
        String b = (s.substring( mid , s.length()).toLowerCase());

        int vowel1 = noofvowel(a);
        int vowel2 = noofvowel(b);

        return vowel1 == vowel2;

    }

    private static int noofvowel(String a) {

        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a' ||a.charAt(i) == 'e' ||a.charAt(i) == 'i' ||a.charAt(i) == 'o' ||a.charAt(i) == 'u')
                c=c+1;
        }
        return c;
    }
}

