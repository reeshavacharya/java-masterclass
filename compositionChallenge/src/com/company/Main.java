package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1= new Wall("west");
        Wall wall2= new Wall("east");
        Wall wall3= new Wall("south");
        Wall wall4= new Wall("north");

        Ceiling ceiling = new Ceiling(12, "yellow");

        Bed bed= new Bed("king",2,3,2,1);
        Lamp lamp= new Lamp("classic",true,80);

        Bedroom bedroom= new Bedroom("myBedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();



    }
}
