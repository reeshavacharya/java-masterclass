package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner n= new Scanner(System.in);
        System.out.println("how many integers? ");
        int a= n.nextInt();
        int[] array= readIntegers(a);
        int minimum= findMin(array);
        System.out.println("minimum element is: "+ minimum);
    }
    public static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static int[] readIntegers(int n){
        int[] array= new int[n];
        Scanner element= new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("enter element "+(i+1)+": ");
            array[i]=element.nextInt();
        }
        return array;
    }
}
