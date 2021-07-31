package cd.rr.calculator;

import cd.rr.calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculator.Menu();
        int userInput = input.nextInt();
        do {
            System.out.print("Enter one number: ");
            int inNum1 = input.nextInt();
            System.out.println("Enter another number: ");
            int inNum2 = input.nextInt();

            switch (userInput) {
                case 1:
                    Calculator.addition(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 2:
                    Calculator.subtraction(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 3:
                    Calculator.multiplication(inNum1, inNum2);
                    Calculator.Menu();
                    userInput = input.nextInt();
                    break;

                case 4:
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
    }
}
