package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SumDigits(333);
        SumDigits(1456);
        SumDigits(-56);
        SumDigits(22);
    }
    public static int SumDigits(int number)
    {int sum=0;
        int copy=number;
        if (number<=10){
            System.out.println("don't enter single digit or negative number");
            return -1;
        }
        else
        {
            while (number>0)
            {

                int n=number%10;
                number/= 10;
                sum+=n;
            }
        }
        System.out.println("the sum of digits "+copy+" is "+sum);
        return sum;
    }
}
