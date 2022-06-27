package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunction {

    public double log(double num1) {
        return (Math.log(num1));
        //This is natural log (Ln)
    }
    public double log10(double num1) {
        return Math.log10(num1);
        //This is Log10
    }
    public double inverseLn(double num1) {
        return Math.exp(num1);
        //This is e^a
    }
    public double e(double num1) {
        double e = 2.71828182846;
        return e * num1;
        //This is base log
    }

}
