package com.company;

public class Main
{
    public static void main(String[] args) {
        calculateFeetAndInchesToCentimeters(3,5);
        calculateFeetAndInchesToCentimeters(50);
    }

	// write your code here
        public static double calculateFeetAndInchesToCentimeters (double feet, double inches)
        {
            if(feet>=0 && inches>=0 && inches<=12)
            {
                double centimeters=  feet*12*2.54 + inches*2.54;
                System.out.println(feet+"ft "+inches+"in = "+centimeters+"cm");
                return centimeters;
            }
            else
            {
                System.out.println("invalid parameters");
                return -1;
            }

        }
        public static double calculateFeetAndInchesToCentimeters(double inches){
            if (inches>=0){
                double feetnumber= (int)inches/12;
                double remaininginches= (int) inches%12;
                return calculateFeetAndInchesToCentimeters(feetnumber, remaininginches);

            }
            else
            {
                return -1;
            }
        }
}
