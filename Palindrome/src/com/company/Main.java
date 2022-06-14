package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        palindromeNumber(2496);
        palindromeString("radar");

    }
    public static void palindromeNumber(long n)
    {   long copy=n, sum=0;
        while (n>0){
            long x=n%10;
            sum=(sum*10)+x;
            n/=10;

        }
        System.out.println("palindrome of number "+copy+" is "+sum);
    }

    public static void palindromeString(String s){
        String copyofstring=s, rev="";
        int length= s.length();
        for(int i=length-1; i>=0; i--){
            rev= rev + s.charAt(i);
        }
        System.out.println("palindrome of string "+copyofstring+" is "+rev);
    }

}
