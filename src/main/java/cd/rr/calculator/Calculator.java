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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator.Menu();
        int userInput = input.nextInt();
        do {
            switch (userInput) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 2:

                case 3:

                case 4:

            }
        }while (userInput != 5);
        if (userInput == 5) {
            System.out.println("Goodbye!");
            System.exit(0);
        }

    }
}
