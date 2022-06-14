package com.company;

import java.awt.*;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList= new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
        System.out.println("your list: ");
        printGroceryList();

    }

    public void printGroceryList(){
        System.out.println("you have "+groceryList.size()+" items");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String item){
        groceryList.set(position-1, item);
        System.out.println("grocery item at position "+(position)+" has been modified to: "+ item);
        System.out.println("your list: ");
        printGroceryList();
    }

    public void removeItem(int position){
        String item= groceryList.get(position-1);
        groceryList.remove(position-1);
        System.out.println("item '"+item+"' has been removed");
        System.out.println("your list: ");
        printGroceryList();
    }

    public String findItem(String item){
        boolean search= groceryList.contains(item);
        if(search) System.out.println("the item "+item+" exists in the list.");
        int position= groceryList.indexOf(item);
        if(position>=0){
            System.out.println("'"+item+"' found at position "+position);
            return groceryList.get(position);
        }
        System.out.println("your list: ");
        printGroceryList();
        return null;
    }
}
