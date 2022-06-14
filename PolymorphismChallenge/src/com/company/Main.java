package com.company;

class Car {
    private boolean engine;
    private String name;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.engine = true;
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine() {
        return ("car-> startEngine(). engine started");
    }

    public String accelerate() {
        return ("car->accelerate(). car is accelerating");
    }

    public String brake() {
        return ("car-> brake(). car stopped");
    }
}

class Audi extends Car {
    public Audi(String name, int cylinder) {
        super(name, cylinder);
    }
    public String startEngine() {
        return ("Audi-> startEngine(). engine started");
    }

    public String accelerate() {
        return ("Audi->accelerate(). car is accelerating");
    }

    public String brake() {
        return ("Audi-> brake(). car stopped");
    }
}


 class Lambo extends Car {
    public Lambo(String name, int cylinder) {
        super(name, cylinder);
    }
    public String startEngine() {
        return (getClass().getSimpleName()+"-> startEngine(). engine started");
    }

    public String accelerate() {
        return (getClass().getSimpleName()+"->accelerate(). car is accelerating");
    }

    public String brake() {
        return (getClass().getSimpleName()+"-> brake(). car stopped");
    }
}

class Ford extends Car {
    public Ford(String name, int cylinder) {
        super(name, cylinder);
    }
    public String startEngine() {
        return ("Ford-> startEngine(). engine started");
    }

    public String accelerate() {
        return ("Ford->accelerate(). car is accelerating");
    }

    public String brake() {
        return ("Ford-> brake(). car stopped");
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car= new Car("Base Car", 10);
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        System.out.println("\n");

        Audi audi= new Audi("R8", 25);
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
        System.out.println(audi.startEngine());

        System.out.println("\n");

        Ford ford= new Ford ("F150", 25);
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());

        System.out.println("\n");

        Lambo lambo= new Lambo("aventedor", 65);
        System.out.println(lambo.accelerate());
        System.out.println(lambo.brake());
        System.out.println(lambo.startEngine());

    }


}
