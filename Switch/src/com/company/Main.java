package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char switchvalue= 'D';
        switch (switchvalue){
            case 'A':
                System.out.println("the value is A");
                break;
            case 'B':
                System.out.println("the value is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("the value is "+switchvalue);
                break;
            default:
                System.out.println("the entered value was not A,B,C,D or E");
                break;

        }

        String month="janUARy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("entered month doesn't start with J");
                break;

        }
    }
}
