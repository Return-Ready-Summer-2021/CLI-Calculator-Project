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
        System.out.println(num1 + num2);
    }

    public static void subtraction(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public static void multiplication(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public static void division(int num1, int num2){
        System.out.println((double)num1 / num2);
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
                    System.out.print("Enter two numbers: ");
                    inNum1 = input.nextInt();
                    inNum2 = input.nextInt();
                    Calculator.addition(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    inNum1 = input.nextInt();
                    inNum2 = input.nextInt();
                    Calculator.subtraction(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    inNum1 = input.nextInt();
                    inNum2 = input.nextInt();
                    Calculator.multiplication(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 4:
                    inNum1 = input.nextInt();
                    inNum2 = input.nextInt();
                    if(inNum1 == 0 || inNum2 == 0){
                        System.out.println("Error");
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






//    switch(op){
//        case "+" :
//            result = num1 + num2;
//            System.out.println("Your result: " + result);
//            break;
//        case "-" :
//            result = num1 - num2;
//            System.out.println("Your result: " + result);
//            break;
//        case "*" :
//            result = num1 * num2;
//            System.out.println("Your result: " + result);
//            break;
//        case "/" :
//            result = num1 / num2;
//            System.out.println("Your result: " + result);
//            break;
//        default:
//            System.out.println("Exit!");
//            break;
//    }



    }
}

