package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal= new Animal("animal", 1,1,6,9);
        Dog dog= new Dog("Labrador", 8,45,2,4,1,45,"short hair");
        dog.eat();
        dog.walk();
        dog.run();
        fish fish= new fish("pirhaha", 36, 6, 3, 2, 4);
        fish.eat();
    }
}
