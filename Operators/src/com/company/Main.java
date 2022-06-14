package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // abbreviating operators
        int result= 20;
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result+=2; // result= result+2
        System.out.println(result);

        result*=10; // result=result*10
        System.out.println(result);

        result/=2; //result= result/ 2
        System.out.println(result);


        boolean isalien= false;
        if(isalien== false)
        {
            System.out.println("there is no alien sorry to dissapoint");
        }

        int topscore=84;
        System.out.println("the top score is:" + topscore);
        int secondtopscore= 67;
        System.out.println("the second top score is: "+ secondtopscore);
        if(topscore>secondtopscore && topscore<100)
        {
            System.out.println("the top score is greater than second top score and the top score is less than 100" );
        }

        if((topscore>secondtopscore) || (topscore<100))
        {
            System.out.println("either the top score is greater than second top score or the top score is less than 100" );
        }

        boolean isman= false;
        if(!isman){
            System.out.println("the person is not a man");
        }
        isman= true;
        boolean wasman= isman? true:false;
        if(wasman){
            System.out.println("the person was a man");
        }
        // another type of example ton use ternary operator
        int ageofclient=30;
        boolean eighteenorover= (ageofclient>=18)? true:false;
        if(eighteenorover){
            System.out.println("the client's age is valid ");
        }

        //operator challenge
        double a=20.00, b=80.00;
        double c=(a+b)*100.00;
        System.out.println("total vallue="+c);
        double d=c%40.00;
        System.out.println("remainder is:"+d);
         boolean checkremainder= (d==0)?true:false;
        System.out.println(checkremainder);
         if(!checkremainder){
             System.out.println("got some remainder");
         }
    }
}
