package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("how many integers in the array? ");
        int n= scanner.nextInt();
        int[] array= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter element "+(i+1)+": ");
            array[i]=scanner.nextInt();
        }
        System.out.println("non-Reversed array is: "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array is: "+ Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int a=0, b=array.length-1;
        while(a<b){
            int temp=array[b];
            array[b]=array[a];
            array[a]=temp;
            a++; b--;
        }
    }
}
