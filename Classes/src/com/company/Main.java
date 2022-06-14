package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Car lamborghini= new Car();
         Car audi= new Car();
         lamborghini.setModel("spyder");
         audi.setModel("g5");
        System.out.println("model is: "+lamborghini.getModel() );
        System.out.println("model is: "+audi.getModel());

    }
}
