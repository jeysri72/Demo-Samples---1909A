package com.bootcamp.day1;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args){
        // You get the marks for 5 subjects
        // Calculate the total & Average
        // Print the grade
        // if the average is greater than 90 - Higher Distinction
        // else if the average is greater than 80 and less than 90 - Distinction
        // else if the average is greater than 70 and less than 80 - Merit
        // else - Pass

        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int mark5;

        int total;
        double average;
        //float average;
        Scanner input = new Scanner(System.in);
        mark1 = input.nextInt();
        mark2 = input.nextInt();
        mark3 = input.nextInt();
        mark4 = input.nextInt();
        mark5 = input.nextInt();

        total = mark1 +mark2+ mark3+ mark4+mark5;
        System.out.println("Total = " + total);
        average = (double) total/ 5;
        // type casting - Coverting one date type to another
        System.out.println("Average = " +average);
        System.out.println("Average = " + (int) average);

        if (average > 90) {
            System.out.println("Higer Distinction");
        }else if (average > 80 && average<=90 ){
            System.out.println("Distinction");
        }else if (average > 70 && average <=80){
            System.out.println("Merit");
        }else if (average<= 70){
            System.out.println("Pass");
        }



    }
}
