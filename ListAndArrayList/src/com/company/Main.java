package com.company;

import java.util.Scanner;

public class Main {
    public static     Scanner scanner= new Scanner(System.in);
    public static     GroceryList myList= new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t0. to print choice options.");
        System.out.println("\t1. to print grocery list");
        System.out.println("\t2. to add item to the list");
        System.out.println("\t3. to modify item in the list");
        System.out.println("\t4. to remove item from the list");
        System.out.println("\t5. to search item in the list");
        System.out.println("\t6. to quit the application");
    }

    public static void addItem(){
        System.out.println("enter item to add: ");
        myList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("enter item no.: ");
        int newItem= scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter replacement item: ");
        String itemName= scanner.nextLine();
        myList.modifyGroceryList(newItem, itemName);
    }

    public static void removeItem(){
        System.out.println("enter item no.: ");
        myList.removeItem(scanner.nextInt());
        scanner.nextLine();
    }

    public static void searchItem(){
        System.out.println("enter item name: ");
        String search= scanner.nextLine();
        if(myList.findItem(search)!=null) {
            int i = 0;
        }
        else System.out.println(search+" could not be found in the grocery list");
    }

}
