package com.souvik.Day18;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch= (char)('a' + i);
            series=series+ch;

        }

       /*string doesn't let us modify the reference object it
     only creates new ones. the time complexity in this case is:
      O(N^2) which is bad . It would be great if we had a data type
     which allowed us to modify it's content


     such data type exists, which is called "String Builder", where new
     object is not created rather it's just modified.
     */

        System.out.println(series);
    }
}
