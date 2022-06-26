package com.zipcodewilmington.scientificcalculator;


import java.awt.*;
import java.util.Scanner;

/**
 * GROUP2: Git-Yee, Gamze, Lloyd
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Group 2's calculator!");

        String currentDisplay = String.valueOf(0.0);
        System.out.println("Current Display: " + currentDisplay);

        CoreCalc calc1 = new CoreCalc();

        Scanner scanner =new Scanner(System.in);
        double num1,num2;
        int selection;
        String choice;
        choice = "yes";


        while (choice.equals("yes")) {

            num1 = Console.getDoubleInput("Please enter your first number:");
            num2 = Console.getDoubleInput("Please enter your second number:");

            System.out.println("Please center your selection");
            System.out.println("0. CLEAR display");
            System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
            System.out.println("5. Square 6. Exponential 7. SquareRoot 8. Inverse 9. Inversion");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("20. M+ Add Current Displayed Value to Memory");
            System.out.println("21. MCR - Recall Current Value from Memory");
            System.out.println("21. MC - Recall Current Value from Memory");
            System.out.println("15. Change Display, Clear Display");

            selection = scanner.nextInt();

            double answer;
            switch(selection){
                //The selection entered correlates to the case number.
                // If selection is 1, then the method under case 1 will run.
                case 1:

                    answer = calc1.addition(num1,num2);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    //String.valueOf -> It turns your parameter into a String.

                    break;
                case 2:
                    answer = calc1.subtraction(num1,num2);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 3:
                    //need to  continue to change the method for the rest to above's.
                    System.out.println(calc1.multiplication(num1,num2));
                    break;
                case 4:
                    if (num2==0){
                        System.out.println("ERR");
                    } else {
                        System.out.println(calc1.division(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println(calc1.square(num1));
                    break;
                case 6:
                    System.out.println(calc1.exponential(num1, num2));
                    break;
                case 7:
                    System.out.println(calc1.squareRoot(num1));
                    break;
                case 8:
                    System.out.println(calc1.inverse(num1));
                    break;
                case 9:
                    System.out.println(calc1.invert(num1));
                    break;
                case 10:
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 11:
//                    System.out.println("Current Display: " + currentDisplay);
                    break;
                default:
                    System.out.println("Yikes, no match exist.");

            }

            System.out.println("Do you wish to continue? yes or no");

            choice = scanner.next();


        }
    }

}

