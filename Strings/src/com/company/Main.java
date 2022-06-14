package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String stringvariable= "this is my first string";
        System.out.println(stringvariable);
        String morestring= ", this is the one i added to the string";

        System.out.println(stringvariable+morestring);
            morestring=morestring+"\u00A9 2021";
        System.out.println(stringvariable+morestring);

        String numstring= "34.25";
        System.out.println(numstring+"34.75");
        // integer, double and any other value will be treated as a string when the said value is appended with a string
        int testint=45;
        double testdouble= 420.69;
        String laststring="3939";
        System.out.println(laststring+testint);
        laststring=laststring+testdouble+testint;
        System.out.println(laststring);

    }
}
