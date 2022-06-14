package com.company;

import java.util.PrimitiveIterator;

public class Car extends Vehicle{
    private int wheels;
    private int door;
    private int gear;
    private boolean isManual;
    private int currentGear;

    public Car(int size, String name, int wheels, int door, int gear, boolean isManual) {
        super(size, name);
        this.wheels = wheels;
        this.door = door;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public void ChangeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): set to "+ this.currentGear+ " gear");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.changeVelocity: "+ speed + " direction: "+direction);
        Move(speed, direction);
    }
}
