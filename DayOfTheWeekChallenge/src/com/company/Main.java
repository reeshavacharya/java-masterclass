package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printDayOfTheWeek(4);
        int i;
        for (i=0; i<=6; i++)
        {
            printDayOfTheWeek(i);
        }
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("INVALID DAY");
        }
    }
}
