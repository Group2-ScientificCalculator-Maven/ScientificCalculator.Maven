package com.zipcodewilmington.scientificcalculator;

public class FactorialFunction {
    public int factorial(int num1){
        if (num1 == 0){
            return 1;
        } else return num1 * factorial(num1 -1);
    }

}
