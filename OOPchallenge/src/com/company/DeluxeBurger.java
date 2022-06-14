package com.company;

public class DeluxeBurger extends  Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "sausage and bacon", 14.66, "white");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("drink", 3.99);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot add additional items to a deluxe burger.");
    }
}
