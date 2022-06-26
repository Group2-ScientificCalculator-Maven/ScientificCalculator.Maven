package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        //This method is for making sure NextDouble is a number.
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        double value;
        while (!scanner.hasNextDouble()) {
            System.out.println("Not a valid number. \n");
            scanner.nextLine();
        }
        value = scanner.nextDouble();
        return value;
    }

