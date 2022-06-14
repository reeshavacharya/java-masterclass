package com.company;

public class Rectangle extends Shape{
    private int width;
    private int height;

    //first constructor
    public Rectangle(int x, int y) {
       this(x,y,0,0); //this will call constructor with four parameters i.e. second constructor
    }

    //second constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y); //this will call th shape class
        this.width = width;
        this.height = height;
    }
}
