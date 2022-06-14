package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=21, i=0;
        while(number<=50){
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            System.out.println("EVEN NUMBER " + number);
            i++;
            if(i>=5) {
                break;
            }

        }
        System.out.println("total even numbers found: "+i);

    }
    public static boolean isEvenNumber(int i)
    {
        if((i%2)==0){
            return true;
        }
        else
        {
            return false;
        }
    }

}
