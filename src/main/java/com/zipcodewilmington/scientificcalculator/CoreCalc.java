package com.zipcodewilmington.scientificcalculator;

public class CoreCalc {
    //Basic Math Operations
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public double square(double num1) {
        return num1 * num1;
    }

    public double exponential(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double squareRoot(double num1) {
        return Math.sqrt(num1);
    }

    public double inverse(double num1) {
        return 1 / num1;
    }

    public double invert(double num1) {
        return -1 * num1;
    }

}
