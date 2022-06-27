package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunction {

    public static double log(double num1) {
        return (Math.log(num1));
        //This is natural log (Ln)
    }
    public static double log10(double num1) {
        return Math.log10(num1);
        //This is Inverse Log
    }
    public static double inverseLn(double num1) {
        return Math.exp(num1);
        //This is Inverse Natural Log
    }
    public static double naturalLog(double num1) {
        double e = 2.71828182846;
        return Math.log(num1);
        //This is base log
    }

}
