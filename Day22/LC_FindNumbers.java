package com.souvik.Day22;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class LC_FindNumbers {
    public static void main(String[] args) {

        int[] nums= {12,345,2,6,7896};
        int numberofevenDigits=findNumbers(nums);
        System.out.println(numberofevenDigits);
    }
    public static int findNumbers(int[] nums) {
        int check;
        int numberofevenDigits=0;
        for (int i = 0; i < nums.length; i++) {
            check=checkifeven(nums[i]);
            if(check==1)
            {
                numberofevenDigits=numberofevenDigits+1;
            }
        }
        return numberofevenDigits;
    }

    private static int checkifeven(int num) {
        int rem;
        int c=0;
        while(num>0)
        {
            rem=num%10;
            c=c+1;
            num=num/10;
        }
        if(c%2==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}


//    int c=0;
//        for(int num: nums)
//                {
//                if(even(num))
//                {
//                c++;
//                }
//                }
//                return c;
//                }
//public static boolean even(int num) {
//        int noOfDigits =digits(num);
//        /*
//        if(noOfDigits % 2 == 0)
//        {
//            return true;
//        }*/
//        return noOfDigits %2 ==0;
//
//        }
//
//public static int digits(int num ){
//        /*int count=0;
//        while(num>0)
//        {
//            count++;
//            num/=10;
//        }
//        return count;*/
//        if(num<0)
//        {
//        num=num*-1;
//        }
//        return (int)(Math.log10(num))+1;
//
//        }
//public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] nums=new int[5];
//        for(int i=0;i<5;i++)
//        {
//        nums[i]=sc.nextInt();
//        }
//        System.out.println(findNumbers(nums));
//        }