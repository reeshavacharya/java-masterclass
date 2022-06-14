package com.company;

public class fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
        System.out.println("fish.rest() called");
    }
    private void movebackfin(){
        System.out.println("fish.movebackfin() called");
    }

    private void swim()
    {
        movebackfin();
        super.move(30);

    }

    @Override
    public void eat() {
        System.out.println("fish.eat() called");
        super.eat();
    }
}
