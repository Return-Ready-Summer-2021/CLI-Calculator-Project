package cd.rr.calculator;

public class Calculator {
    public static void main(String[] args) {
        // Your solution here!

        int num1;
        int num2;

        public static void addition(num1, num2){
            System.out.println(num1 + num2);
        }

        public static void subtraction(num1, num2){
            System.out.println(num1 - num2);
        }

        public static void multiplication(num1, num2){
            System.out.println(num1 * num2);
        }

        public static void division(num1, num2){
            System.out.println(String.format("%2.f", num1 / num2));
        }


    switch(op){
        case "+" :
            result = num1 + num2;
            System.out.println("Your result: " + result);
            break;
        case "-" :
            result = num1 - num2;
            System.out.println("Your result: " + result);
            break;
        case "*" :
            result = num1 * num2;
            System.out.println("Your result: " + result);
            break;
        case "/" :
            result = num1 / num2;
            System.out.println("Your result: " + result);
            break;
        default:
            System.out.println("Exit!");
            break;
    }

    if(userinput == 4 && num1 == 0 || num2 == 0){
        System.out.println("Error");
    }

    }
}
