package com.souvik.Day35;

public class LC_1662_EquivalentString {

    public static void main(String[] args) {

        String[] word1 = { "abc", "d", "defg"};
        String[] word2 = { "abcddefg"};

        System.out.println(arrayStringsAreEqual(word1,word2));

    }



    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        /*Runtime: 1 ms, faster than 74.08% of Java online submissions for Check If Two String Arrays are Equivalent.
        Memory Usage: 38.9 MB, less than 26.38% of Java online submissions for Check If Two String Arrays are Equivalent.*/

        StringBuilder w1= new StringBuilder();
        StringBuilder w2= new StringBuilder();

        for (String value : word1) {
            w1.append(value);
        }

        for (String s : word2) {
            w2.append(s);
        }

        return w1.toString().equals(w2.toString());


         /*Runtime: 2 ms, faster than 30.83% of Java online submissions for Check If Two String Arrays are Equivalent.
     Memory Usage: 39.1 MB, less than 19.69% of Java online submissions for Check If Two String Arrays are Equivalent.*/

        /*String w1="";
        String w2="";

        for(int i = 0; i <word1.length ; i++)
        {
            w1 = w1 + word1[i];
        }

        for(int i = 0; i <word2.length ; i++)
        {
            w2 = w2 + word2[i];
        }

        return w1.equals(w2);*/




    }
}
