package cd.rr.calculator;

import java.util.Scanner;


public class Calculator {


    public static void Menu(){
        System.out.println("Welcome to the CLI Calculator");
        System.out.println("-----------------------------\n");
        System.out.println("Opperations: ");
        System.out.println("""
                1: Addition
                2: Subtraction
                3: Multiplication
                4: Division
                5: Exit""");
        System.out.print("Please choose an operation (1-5): ");
    }

    public static void addition(int num1, int num2){
        System.out.println("Result: " + (num1 + num2));
    }

    public static void subtraction(int num1, int num2){
        System.out.println("Result: " + (num1 - num2));
    }

    public static void multiplication(int num1, int num2){
        System.out.println("Result: " + (num1 * num2));
    }

    public static void division(int num1, int num2){
        double divisionResult = (double) num1 / num2;
        double roundDivision = Math.round(divisionResult * 100.0) / 100.0;
        System.out.println("Result: " + (roundDivision));
    }
    public static void main(String[] args) {
        int inNum1;
        int inNum2;
        Scanner input = new Scanner(System.in);
        Calculator.Menu();
        int userInput = input.nextInt();
        do {
            switch (userInput) {
                case 1:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.println("Enter another number: ");
                    inNum2 = input.nextInt();
                    Calculator.addition(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 2:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.println("Enter another number: ");
                    inNum2 = input.nextInt();
                    Calculator.subtraction(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 3:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.println("Enter another number: ");
                    inNum2 = input.nextInt();
                    Calculator.multiplication(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 4:
                    System.out.println("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.println("Enter another number: ");
                    inNum2 = input.nextInt();
                    if(userInput == 4 && inNum2 == 0){
                        System.out.println("Error: Cannot divide by 0");
                        Calculator.Menu();
                        userInput = input.nextInt();
                        break;
                    }
                    else {
                        Calculator.division(inNum1, inNum2);
                        Calculator.Menu();
                        userInput = input.nextInt();
                        break;
                    }

            }
        }while (userInput != 5);
        if (userInput == 5) {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        // Your solution here!










    }
}

