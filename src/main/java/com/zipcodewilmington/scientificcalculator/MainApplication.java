package com.zipcodewilmington.scientificcalculator;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * GROUP2: Git-Yee, Gamze, Lloyd
 */
public class MainApplication {
    public static void main(String[] args) {

        System.out.println("Welcome to Group 2's calculator!");

        String currentDisplay = String.valueOf(0.0);
        System.out.println("Current Display: " + currentDisplay + "\n");

        CoreCalc calc1 = new CoreCalc();
        Scanner scanner =new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        int selection;
        String choice = "yes";
        String clear = "Current Display: ERR";
        String memory = "0.0";


        while (choice.equals("yes")) {

            System.out.println("Please enter your selection.");
            System.out.println("0-CLEAR display");
            System.out.println("1-Addition 2-Subtraction 3-Multiplication 4-Division");
            System.out.println("5-Square 6-Exponential 7-SquareRoot 8-Inverse 9-Inversion");
            System.out.println("10-Sine 11-Cosine 12-Tangent");
            System.out.println("13-Inverse Sine 14-Inverse Cosine 15-Inverse Tangent");
            System.out.println("20-Log 21-Inverse Log 22-Natural Log 23-Inverse LN 24-Factorial");
            System.out.println("25-MC for Reset Memory");
            System.out.println("26-M+ to Add Current Display Value to Memory");
            System.out.println("27-MCR to Recall Current Value from Memory");
            System.out.println("28-Get Current Date and Time");
            System.out.println("29-HELLO)");

            selection = scanner.nextInt();

            if(selection!=0 && selection<25) {
                //runs following prompt if selection is not 0 or greater than 25
                num1 = Console.getDoubleInput("Please enter your first number:");
                num2 = Console.getDoubleInput("Please enter your second number:\nIf no second number is needed, enter '0'");
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
                case 10: //sine
                    answer = Scientific.sin(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 11: //cosine
                    answer = Scientific.cos(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 12: //tangent
                    answer = Scientific.tan(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 13: //inverse sine
                    answer = Scientific.asin(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 14: //inverse cosine
                    answer = Scientific.acos(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 15: //inverse tangent
                    answer = Scientific.atan(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 20: //log
                    answer = LogarithmicFunction.Log(num1, num2);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 21: //inverse log
                    answer = LogarithmicFunction.inverseLog(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 22: //natural log
                    answer = LogarithmicFunction.naturalLog(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 23: //inverse natural log
                    answer = LogarithmicFunction.inverseLn(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                    break;
                case 24://factorial
                    answer = FactorialFunction.factorial(num1);
                    currentDisplay = String.valueOf(answer);
                    System.out.println("Current Display: " + currentDisplay);
                case 25:
                    memory = String.valueOf(0.0);
                    System.out.println("Memory reset to " + memory);
                    //String.valueOf -> It turns your parameter into a String.
                    break;
                case 26:
                    memory = currentDisplay;
                    System.out.println("Stored to Memory: " + memory);
                    break;
                case 27:
                    System.out.println("Previous Stored Memory: " + memory);
                    break;
                case 28: //get current date and time
                    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                    System.out.println("Current Display: " + timeFormat.format(LocalDateTime.now()));
                    break;

                case 29://HELLO
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("--------|   |  |   |---|    _____|---|   |----------|   |---------|        |------");
                    System.out.println("--------|   |__|   |---|   |---------|   |----------|   |---------|   ||   |------");
                    System.out.println("--------|    __    |---|    ___|-----|   |----------|   |---------|   ||   |------");
                    System.out.println("--------|   |  |   |---|   |---------|   |______----|   |______---|   ||   |------");
                    System.out.println("--------|   |  |   |---|    -----|---|          |---|         |---|        |------");
                    System.out.println("=---------------------------------------------------------------------------------");
                    break;

                default:
                    System.out.println("Yikes, no match exist.");

            }

            System.out.println("Do you wish to continue? yes or no");

            choice = scanner.next();

        }
    }

}

