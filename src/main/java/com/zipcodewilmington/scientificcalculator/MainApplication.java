package com.zipcodewilmington.scientificcalculator;


import java.awt.*;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
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
        double num1 = 0.0;
        double num2 = 0.0;
        int selection;
        String choice = "yes";
        String clear = "Current Display: ERR";
        String memory = "Memory";



        while (choice.equals("yes")) {

            System.out.println("Please enter your selection.");
            System.out.println("0. CLEAR display");
            System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
            System.out.println("5. Square 6. Exponential 7. SquareRoot 8. Inverse 9. Inversion");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("20. M+ Add Current Displayed Value to Memory");
            System.out.println("21. MCR - Recall Current Value from Memory");
            System.out.println("22. MC - Recall Current Value from Memory");
            System.out.println("30. Get Current Time");
            System.out.println("31. Something Fun"); //Lloyd will work on this.

            selection = scanner.nextInt();

            if(selection!=30) {
                num1 = Console.getDoubleInput("Please enter your first number:");
                num2 = Console.getDoubleInput("Please enter your second number:");
            }

            double answer;
            switch(selection){
                //The selection entered correlates to the case number.
                // If selection is 1, then the method under case 1 will run.
                case 0:

                    currentDisplay = String.valueOf(0.0);
                    System.out.println("Current Display: " + currentDisplay);
                    //String.valueOf -> It turns your parameter into a String.

                    break;
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
                    answer = calc1.multiplication(num1,num2);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 4:

                    if (num2==0){
                        currentDisplay = "ERR";
                        System.out.println("Current Display: " + currentDisplay);
                    } else {
                        answer = calc1.division(num1,num2);
                        currentDisplay = String.valueOf(answer);
                        System.out.println("Current Display: " + currentDisplay);
                    }

                    switch(clear){
                        case "Current Display: ERR":
                            System.out.println("Type 'clear' to clear ERR");
//                            String clear;
                            clear = scanner.next();

                            switch (clear){
                                case "clear":
                                    currentDisplay = String.valueOf(0.0);
                                    System.out.println("Current Display: " + currentDisplay);
                                break;
                            }
                        break;
                    }
                    break;
                case 5:
                    answer = calc1.square(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 6:
                    answer = calc1.exponential(num1,num2);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 7:
                    answer = calc1.squareRoot(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 8:
                    answer = calc1.inverse(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 9:
                    answer = calc1.invert(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 10:


                    break;
                case 30:
                    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                    System.out.println("Current Display: " + timeFormat.format(LocalDateTime.now()));
                    break;

//                case 31:
//                    System.out.println("Current Display: " + currentDisplay);
//                    break;

                default:
                    System.out.println("Yikes, no match exist.");

            }

            System.out.println("Do you wish to continue? yes or no");

            choice = scanner.next();

        }
    }

}

