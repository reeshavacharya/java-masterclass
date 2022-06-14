package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("how many integers to be sorted?: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        int[] sortArrays= new int[array.length];
        sortArrays=sortArray(array);
        printArray(sortArrays);
    }
    public static void printArray(int[] array){
        System.out.println("The sorted array is: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+"\n");
        }
    }
    public static int[] sortArray(int[] passed)
    {
        int[] array= Arrays.copyOf(passed, passed.length);
        for(int i=0; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]<array[j]){
                    int temp=array[j];
                    array[j]= array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }
}
