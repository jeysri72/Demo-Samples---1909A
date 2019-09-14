package com.bootcamp.day1;

import java.util.Scanner;

public class AdditionofTwoNumbers {
    public static void main (String[] args){
     // get two numbers
     // calculate the sum
     // print

     int a;
     int b;
     int sum = 0;


//    // How to get the two numbers?
//        // Using scanner
//    // How to use the Scanner
//        // Instantiate (create)  new scanner
//     Scanner input = new Scanner(System.in);
//
//        int loop = 3;
//
//        //while(loop < 3) {
//        do{
//            loop++;//Post incrementor => loop = loop + 1; self increment
//
//            System.out.println("Loop : "+ loop);
//         System.out.println("Enter the value of a: ");
//         a = input.nextInt();
//
//         System.out.println("Enter the value of b: ");
//         b = input.nextInt();
//
//         sum = a + b;
//
//         System.out.println("Sum is: " + sum);
//
//         // Check sum is Odd or Even?
//         int remainder;
//         remainder = sum % 2;
//
//         //If the remainder is zero then even number else odd.
//         //Paranthesis
//         if (remainder == 0) {
//             System.out.println("Sum is an even number");
//         } else {
//             System.out.println("Sum is an odd number");
//         }
//
//
//         switch (remainder) {
//             case 0:
//                 System.out.println("Even");
//                 break;
//             case 1:
//                 System.out.println("Odd");
//                 break;
//             default:
//
//         }
//     }while (loop<3);

        for (int i = 0 ; i<5; i++){
            if (i == 1) break;
            if (i == 2) continue;
            System.out.println(i);

        }
    }


}
