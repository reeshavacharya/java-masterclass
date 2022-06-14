package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String stringvalue="2021";
        System.out.println("number as string= "+ stringvalue);

        int numbervalue=Integer.parseInt(stringvalue);
        System.out.println("number as number= "+ numbervalue);

        stringvalue+=1;
        numbervalue+=1;
        System.out.println("string: "+stringvalue);
        System.out.println("number: " + numbervalue);


    }
}
