package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions= new Dimensions(20,20,5);
        Case theCase= new Case("220B", "Dell", "240",dimensions);

        Monitor theMonitor= new Monitor("27inch Beast", "Acer", 27, new Resolution(2550, 1440) );
        Motherboard theMotherboard= new Motherboard("bJ-200", "ASUS",3,4,"v2.44");

        PC thePC= new PC(theCase, theMonitor,theMotherboard);
         thePC.powerUp();
    }
}
