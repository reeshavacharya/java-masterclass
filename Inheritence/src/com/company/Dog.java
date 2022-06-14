package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override // eat bhanne method animal class ma pani cha tara override use gare bhane suruma dog ma bhako eat bhanne method use garcha
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // super use gare bhane supercalss i.e. animal class ko eat method execute huncha
    }

    public void walk(){
        System.out.println("Dog.walk() called" );
        super.move(34);

    }
    public void run()
    {
        System.out.println("Dog.run() called");
        move(50);
    }
    private void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() called.");
    }
// tala ko override move method ko lagi ho. main class ma dog.move() call gare bhane yo method suruma execute huncha.
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
