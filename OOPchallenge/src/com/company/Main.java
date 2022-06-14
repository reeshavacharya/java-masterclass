package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger= new Hamburger("basic","sausage",3.56,"brown");
        double price= hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.33);
        hamburger.addHamburgerAddition3("cheese",0.75);
        System.out.println("total burger price is: "+ hamburger.itemizedHamburger());

        HealthyBurger healthyBurger= new HealthyBurger("CHICKEN",  5.99);
//        healthyBurger.itemizedHamburger();
        healthyBurger.addHamburgerAddition1("egg",1.99);
        healthyBurger.addHamburgerAddition2("mushroom",3.99);
        System.out.println("total healthy burger price is: "+healthyBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger= new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("poop", 0.05);
        deluxeBurger.itemizedHamburger();    }
}
