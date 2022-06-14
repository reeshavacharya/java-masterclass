package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer= new Printer(45,false);
        System.out.println("initial page count="+ printer.getPages());
        int printedPages= printer.printPage(7);
        System.out.println("pages printed was "+printedPages+"... new total print count for printer= "+ printer.getPages());

        // for toner level
        System.out.println("initial toner level is: "+printer.getTonerLevel());
        printer.fillToner(20);
        System.out.println("ink added. new toner level is: "+ printer.getTonerLevel());
    }
}
