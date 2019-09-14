package com.bootcamp.day1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrintEvenNumbers {
    public static void main (String[] args){

        int i = 0;
        //Store the even numbers in an array
        int[] evenNumber; //Single dimension integer array declaration
        evenNumber = new int[11]; // Initializing with 10 items
        int index = 0;
        for (i = 0; i < 21; i+=2){
            evenNumber[index]= i; // Assign value to an array element
            index ++;
        }

        for (index=0; index<evenNumber.length; index++){
            //The element at index 0 = 0;
            //The element at index 1 = 2;
            // \n - new line character - Returns to the next line

            System.out.printf("The element at index %d = %d\n",
                    index, evenNumber[index] );
        }

        System.out.println("Print ");
        for (index=0; index<evenNumber.length; index++){
            //The element at index 0 = 0;
            //The element at index 1 = 2;
            // \n - new line character - Returns to the next line

            System.out.print("The element at index " +  index +
                            " = " +  evenNumber[index] + "\n");

            //System.out.print("The element at index " + index + " = " + evenNumber{index] + " \n");
        }


//        for (i=0; i<21; i++ ){
//            if (i % 2 == 1) continue;
//            System.out.println(i);
//        }
//        i = 0;
//        do{
//            System.out.println(i);
//            i+=2;
//        }while (i<20);
    }




}
