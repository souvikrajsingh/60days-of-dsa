package com.souvik.Day35;

//https://leetcode.com/problems/defanging-an-ip-address/

public class LC_1108_IPDefang {

    public static void main(String[] args) {

        String address =  "255.100.50.0";
        String newString = defangIPaddr(address);
        System.out.println(newString);

    }
    public  static String defangIPaddr(String address) {


        /*Runtime: 9 ms, faster than 5.93% of Java online submissions for Defanging an IP Address.
        Memory Usage: 39.4 MB, less than 6.23% of Java online submissions for Defanging an IP Address.*/

        /*String newString="";
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.')
            {
                newString = newString + "[.]";
            }
            else
            {
                newString = newString + address.charAt(i);
            }
        }
        return newString;*/

        /*Using String Builder*/

        /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
        Memory Usage: 38.4 MB, less than 39.45% of Java online submissions for Defanging an IP Address.*/

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.')
            {
                newString.append("[.]");
            }
            else
            {
                newString.append(address.charAt(i));
            }
        }

        return newString.toString();



        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
        Memory Usage: 38.7 MB, less than 30.52% of Java online submissions for Defanging an IP Address.

        String replaceString = address.replace(".","[.]");
         return replaceString;*/
    }

}
