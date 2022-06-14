package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        int counter=0,max=0, min=0;
        boolean first=true; //first number checker or a boolean flag
        while (true){
            System.out.println("Enter Number "+counter+1+":");
            boolean hasNextInt= scanner.hasNextInt();
            if(hasNextInt){
                int number= scanner.nextInt();
                if(first) // only executes when user enters first number, it's a simple spell but quite unbreakable
                {
                    first=false; //after user enters first number, this variable will be set to false for other numbers
                    min=number;
                    max=number;
                }
                if(number>max){
                    max=number;
                }
                if(number<min)
                {
                    min=number;
                }
            }
            else {
                break;
            }
        }
        System.out.println("min= "+ min+" max= "+ max);
        scanner.close();
    }
}
