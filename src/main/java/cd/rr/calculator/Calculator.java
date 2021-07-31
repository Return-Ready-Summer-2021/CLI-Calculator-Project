package cd.rr.calculator;

import java.util.Scanner;


public class Calculator {


    public static void Menu(){
        System.out.println("Welcome to the CLI Calculator");
        System.out.println("-----------------------------\n");
        System.out.println("Operations: ");
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

}

