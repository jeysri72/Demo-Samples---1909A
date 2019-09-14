package com.bootcamp.day2;

public class Calculator {
    private double firstOperand;
    private double secondOperand;

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double add(){
        return firstOperand + secondOperand;
    }

    public double subtract(){
        return firstOperand - secondOperand;
    }
    public double multiply(){
        return firstOperand * secondOperand;
    }

    public double divide(){
        return firstOperand / secondOperand;
    }
}
