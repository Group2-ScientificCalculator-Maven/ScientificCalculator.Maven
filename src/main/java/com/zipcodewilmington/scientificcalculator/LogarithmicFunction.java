package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunction {

    public double log(double num1) {
        return Math.log(num1);
        //Returns natural logarithm (base e) of a double value
    }
    public double log10(double num1) {
        return Math.log10(num1);
        //Returns the base 10 logarithm of a double value
    }
    public double log1p(double num1) {
        return Math.log1p(num1);
        //Returns the natural logarithm of the sum of the argument and 1
    }
    public static double e(double num1) {
        double e = 2.71828182846;
        return e * num1;
        //Returns e (2.71828182846) * num1)
    }

}
