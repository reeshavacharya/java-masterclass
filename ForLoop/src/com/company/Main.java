package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(double i=2; i<=8; i++) {
            System.out.println("10,000 at "+i + "% rate =" + String.format("%.2f",calculateInterest(10000, i)));
        }


        System.out.println("*********BACKWARDS*********");
        for(double i=8; i>=2; i--) {
            System.out.println("10,000 at "+i + "% rate =" + String.format("%.2f",calculateInterest(10000, i)));
        }
        int a=0;
        for (int x=2; x<=20; x++)
        {
            if ( isPrime(x))
            {   a++;
                System.out.println(x);
            }

            if(a==3){
                break;
            }
        }


    }


    public static double calculateInterest(double amount, double interestRate)
    {
        return(amount*(interestRate/100));
    }

    public static boolean isPrime(int n){

        if(n==1){
            return false;

        }
        for (int i=2; i<= (long)Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }

        return true;

    }


}
