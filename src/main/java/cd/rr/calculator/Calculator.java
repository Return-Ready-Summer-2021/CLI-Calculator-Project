package cd.rr.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Your solution here!
            boolean running=true;
            while (running) {

            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the CLI Calculator");
            System.out.println("-----------------------------");


            System.out.println("Operations:");


            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Remainder Operator");
            System.out.println("6: Exit");

            System.out.println("Choose your operation:");
            int n = input.nextInt();

            if (n == 6) {
                System.out.println("Good bye!");
                running=false;
            }
                else if (n>6){
                System.out.println("Invalid operation");

            }else {

                System.out.println("First Number: ");
                double firstNumber = input.nextDouble();
                System.out.println("Second Number: ");
                double secondNumber = input.nextDouble();


                switch (n) {
                    case 1:
                        double add = firstNumber + secondNumber;
                        System.out.println("Result:" + (int) add);
                        break;
                    case 2:
                        double sub = firstNumber - secondNumber;
                        System.out.println("Result:" + (int) sub);
                        break;
                    case 3:
                        double multiply = firstNumber * secondNumber;
                        System.out.println("Result:" + (int) multiply);
                        break;
                    case 4:
                        if (secondNumber == 0) {
                            System.out.println("Error: Cannot divide by 0");
                        } else {
                            double div = firstNumber / secondNumber;
                            System.out.println("Result:" + String.format("%.2f", div));
                        }

                        break;
                    case 5:
                        double remainder = firstNumber % secondNumber;
                        System.out.println("Result:" + (int) remainder);
                        break;




                }

            }


        }
    }
}

