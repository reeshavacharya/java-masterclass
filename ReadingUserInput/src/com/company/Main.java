package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your year of birth:");
        boolean HasNextInt=scanner.hasNextInt();
        if(!HasNextInt){
            System.out.println("invalid year of birth");
        }
        else {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character

            System.out.println("enter your name: ");
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("invalid year of birth");
            }
        }
        scanner.close();

    }
}
