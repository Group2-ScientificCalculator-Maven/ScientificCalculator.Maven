package com.zipcodewilmington.scientificcalculator;


import java.awt.*;
import java.util.Scanner;

/**
 * GROUP2: Git-Yee, Gamze, Lloyd
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator!");
        System.out.println("Display Value:");

        double Display;




//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);

        CoreCalc calc1 = new CoreCalc();
//        System.out.println(calc1.addition(3,4));

        Scanner scanner =new Scanner(System.in);
        double num1,num2;
        int selection;
        String choice;
        choice = "yes";


        while (choice.equals("yes")) {
            System.out.println("Please enter your first number:");
            num1 = scanner.nextDouble();
            System.out.println("Please enter your second number:");
            num2 = scanner.nextDouble();

            System.out.println("Please center your selection");
            System.out.println("0. CLEAR display");
            System.out.println("1. Addition 2. Subtraction");
            System.out.println("3. Multiplication 4. Division");
            System.out.println("5. Square 6. Exponential 7. SquareRoot");
            System.out.println("8. Inverse 9. Inversion");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. Current, Clear, Recall");
            System.out.println("15. Current Display, Clear Display");

            selection = scanner.nextInt();


            switch(selection){
                case 1:
                    System.out.println(calc1.addition(num1,num2));
                    break;
                case 2:
                    System.out.println(calc1.subtraction(num1,num2));
                    break;
                case 3:
                    System.out.println(calc1.multiplication(num1,num2));
                    break;
                default:
                    System.out.println("Yikes, no match exist.");

            }

            System.out.println("Do you wish to continue? yes or no");

            choice = scanner.next();




//            break; //to end while loop

        }
    }

}

