package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer person1= new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2= new VipCustomer("Francis", 50000);
        System.out.println(person2.getName());

        VipCustomer person3= new VipCustomer("Ciryl", 100.00, "Gane@ufc.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
