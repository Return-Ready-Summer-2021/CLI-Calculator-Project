package cd.rr.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Your solution here!

        boolean done = false;

        while (!done) {


            //The user can view a menu of operations
            System.out.println("Welcome to the CLI Calculator");
            System.out.println("-----------------------------------");

            System.out.println("Operation: ");
            System.out.println("1: Addition ");
            System.out.println("2: Subtraction ");
            System.out.println("3: Multiplication ");
            System.out.println("4: Division ");
            System.out.println("5: Exit");

            //The user can choose an operation to perform
            System.out.println("Choose your operation:  ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            double num1 = 0;
            double num2 = 0;
            //The user can enter two integers
            if (x != 5) {
                System.out.println("First Number: ");
                num1 = scanner.nextDouble();
                System.out.println("Second Number: ");
                num2 = scanner.nextDouble();
            }
            //The system performs the chosen operation on the two numbers provided
            //The user can view the result of the calculation
            switch (x) {
                case 1:
                    double add = num1 + num2;
                    System.out.println("Result:   " + (int) add);
                    break;
                case 2:
                    double sub = num1 - num2;
                    System.out.println("Result:  " + (int) sub);
                    break;
                case 3:
                    double mul = num1 * num2;
                    System.out.println("Result:  " + (int) mul);
                    break;
                case 4:
                    //The user should see an error if they try to divide by zero
                    if (num2 == 0) {
                        System.out.println("Can't divide by zero");
                        break;
                    }
                    double div = num1 / num2;
                    //The system should limit the answer to a division problem to two decimals
                    System.out.println(String.format("Output" + " " + String.format("%.2f", div)));

                    break;
                case 5:
                    //The program will run until the user chooses to exit
                    done = true;
                    System.out.println("Goodbye!");
                    break;

//The end of the project
            }

        }
    }
}
