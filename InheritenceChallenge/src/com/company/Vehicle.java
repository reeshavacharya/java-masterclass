package com.company;

public class Vehicle {
    private int size;
    private String name;
    private int CurrentVelocity;
    private int CurrentDirection;

    public Vehicle(int size, String name) {
        this.size = size;
        this.name = name;
        this.CurrentDirection=0;
        this.CurrentVelocity=0;
    }
    public void Steer(int Direction)
    {
        this.CurrentDirection+= Direction;
        System.out.println("vehicle is moving at: "+ this.CurrentDirection+ " degrees.");
    }
    public void Move(int Velocity, int Direction)
    {
        this.CurrentVelocity= Velocity;
        this.CurrentDirection= Direction;
        System.out.println("vehicle is moving at velocity: "+this.CurrentVelocity+" adn the direction is:"+this.CurrentDirection+" degrees");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        CurrentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        CurrentDirection = currentDirection;
    }
    public void stop ()
    {
        this.CurrentVelocity=0;
    }
}
