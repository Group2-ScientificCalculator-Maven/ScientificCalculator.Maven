package com.zipcodewilmington.scientificcalculator;

public class FactorialFunction {

    public static double factorial(double num1){
        if ( num1 == 1){
            return 1;
        } else {
            return num1 * factorial( -1);
        }
    }

}
