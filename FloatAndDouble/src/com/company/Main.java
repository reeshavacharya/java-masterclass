package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float minfloatval= Float.MIN_VALUE;
        float maxfloatval= Float.MAX_VALUE;
        System.out.println("minimum float value is: "+ minfloatval);
        System.out.println("maximum float value is: "+ maxfloatval);



        double mindoubleval= Double.MIN_VALUE;
        double maxdoubleval= Double.MAX_VALUE;
        System.out.println("minimum double value is: "+ mindoubleval);
        System.out.println("maximum double value is: "+ maxdoubleval);

        int intnum= 5;
        float floatnum=5f;
        double doublenum=5d;

        System.out.println("integer value is:" + intnum);
        System.out.println("float value is:" + floatnum);
        System.out.println("double value is:" + doublenum);

        double lbs=155, kgs;
        kgs= lbs*0.45359237;
        System.out.println("converted kilograms="+kgs);
    }
}
