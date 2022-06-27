package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunction {

    public static double Log(double num1, double num2) {
        return ((Math.log(num2)) / Math.log(num1));
        //This is Log
    }
    public static double inverseLog(double num1) {
        return Math.log10(num1);
        //This is Inverse Log
    }
    public static double inverseLn(double num1) {
        return Math.exp(num1);
        //This is Inverse Natural Log
    }
    public static double naturalLog(double num1) {
        return Math.log(num1);
        //This is Natural Log
    }

}
