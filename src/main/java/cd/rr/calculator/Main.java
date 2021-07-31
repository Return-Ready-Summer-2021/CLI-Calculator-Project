package cd.rr.calculator;

import cd.rr.calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int userInput;
        int inNum1;
        int inNum2;
        do {
            Calculator.Menu();
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    inNum2 = input.nextInt();
                    Calculator.addition(inNum1, inNum2);
                    break;

                case 2:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    inNum2 = input.nextInt();
                    Calculator.subtraction(inNum1, inNum2);
                    break;

                case 3:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    inNum2 = input.nextInt();
                    Calculator.multiplication(inNum1, inNum2);
                    break;

                case 4:
                    System.out.print("Enter one number: ");
                    inNum1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    inNum2 = input.nextInt();
                    if(inNum2 == 0){
                        System.out.println("Error: Cannot divide by 0");

                    }
                    else {
                        Calculator.division(inNum1, inNum2);
                    }
                    break;
                default:
                    System.out.println("Not a valid input, try again.");
            }
        }while (userInput != 5);

            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

