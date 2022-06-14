package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        int counter =1, sum=0;

        while(counter<=10)
        {
            System.out.println("enter number #"+counter+":");
            boolean HasNextInt= scanner.hasNextInt();


            if(HasNextInt){
                int number= scanner.nextInt();
                counter++;
                sum+=number;
            }
            else
            {
                System.out.println("enter valid input");
            }
            scanner.nextLine();
        }
        System.out.println("the sum is: "+sum);
        scanner.close();
    }
}
