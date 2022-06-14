package com.company;

public class Main {
//
    public static void main(String[] args) {
//	// write your code here
//    Player player= new Player();
//    player.name="ree";
//    player.health=100;
//    player.weapon="gun";
//
//    int damage=20;
//    player.loseHealth(damage);
//    System.out.println("Remaining Health is: "+ player.healthRemaining());
//    damage= 82;
//    player.loseHealth(damage);
//        System.out.println("Remaining Health is: "+ player.healthRemaining());
        EnhancedPlayer player= new EnhancedPlayer("ryukiree",200,"swords");
        System.out.println("initial health is: " + player.getHealth());
        player.loseHealth(30);
        System.out.println(player.getHealth());


    }
}
