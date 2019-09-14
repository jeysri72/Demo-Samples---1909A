package com.bootcamp.day2;

public class CalculatorTest {
    public static void main (String[] args){
        Calculator myCalc = new Calculator();
        myCalc.setFirstOperand(5);
        myCalc.setSecondOperand(3);

        System.out.printf("%f + %f = %f\n",
                            myCalc.getFirstOperand(),
                            myCalc.getSecondOperand(),
                            myCalc.add());
        System.out.printf("%.2f + %.2f = %.2f\n",
                myCalc.getFirstOperand(),
                myCalc.getSecondOperand(),
                myCalc.add());

        System.out.printf("%.2f - %.2f = %.2f\n",
                myCalc.getFirstOperand(),
                myCalc.getSecondOperand(),
                myCalc.subtract());
        System.out.printf("%.2f * %.2f = %.2f\n",
                myCalc.getFirstOperand(),
                myCalc.getSecondOperand(),
                myCalc.multiply());
        System.out.printf("%.2f / %.2f = %.2f\n",
                myCalc.getFirstOperand(),
                myCalc.getSecondOperand(),
                myCalc.divide());

        myCalc.setFirstOperand(56.78);
        myCalc.setSecondOperand(355.78);

        System.out.printf("%.2f + %.2f = %.2f\n",
                myCalc.getFirstOperand(),
                myCalc.getSecondOperand(),
                myCalc.add());

        System.out.printf("%d + %d = %.0f\n",
                (int) myCalc.getFirstOperand(),
                (int) myCalc.getSecondOperand(),
                myCalc.add());

        System.out.printf("%d + %d = %d\n",
                (int) myCalc.getFirstOperand(),
                (int) myCalc.getSecondOperand(),
                (int) myCalc.add());

        System.out.println((int) myCalc.getFirstOperand() + " + " +
                           (int) myCalc.getSecondOperand() + " = " +
                            (int) myCalc.add());
    }
}
