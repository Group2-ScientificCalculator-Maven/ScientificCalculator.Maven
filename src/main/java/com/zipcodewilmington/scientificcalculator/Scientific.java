package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;

public class Scientific {
    public static double cos(double numA) {
        return Math.cos(numA);
    }

    public static double sin(double numB) {
        return Math.sin(numB);
    }

    public static double tan(double numC) {
        return Math.tan(numC);
    }

/*public static double acos(String[] args){
                double numD = 0.6;
                return Math.acos(numD);{
            }*/

    public static void acos(String[] args) {

        // get a variable x which is equal to PI/2
        double x = Math.PI / 2;

        // convert x to radians
        x = Math.toRadians(x);

        // get the arc cos of x
        System.out.println("Math.acos(" + x + ")=" + Math.acos(x));
    }

    public static void asin(String[] args) {

        // get a variable x which is equal to PI/2
        double y = Math.PI / 4;

        // convert x to radians
        y = Math.toRadians(y);

        // get the arc sine of x
        System.out.println("Math.asin(" + y + ")=" + Math.asin(y));
    }

    public static void atan(String[] args) {

        // get a variable x which is equal to PI/2
        double z = Math.PI / 8;

        // convert x to radians
        z = Math.toRadians(z);

        // get the arc tan of x
        System.out.println("Math.atan(" + z + ")=" + Math.atan(z));
    }

    public static void main(String args[]) {
        double a = -2.55;
        double b = 1.0 / 0;
        double c = 0, d = 145.256;

        System.out.println(Math.log(a));
        System.out.println(Math.log(b));
        System.out.println(Math.log(c));
    }
}
