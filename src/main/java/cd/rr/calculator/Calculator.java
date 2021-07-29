package cd.rr.calculator;

public class Calculator {
    public static void main(String[] args) {
        // Your solution here!

        int firstNumber, secondNumber;
        public static void addition(int firstNumber, int secondNumber){
            System.out.println(firstNumber + secondNumber);
        }

        public static void subtraction(int firstNumber, int secondNumber){
            System.out.println(firstNumber - secondNumber);
        }

        public static void multiplication(int firstNumber, int secondNumber){
            System.out.println(firstNumber * secondNumber);
        }

        public static void division(int firstNumber, int secondNumber){
            System.out.println(String.format("%2.f", firstNumber / secondNumber));
        }


    switch(op){
        case "+" :
            result =  +  ;
            System.out.println("Your result: " + result);
            break;
        case "-" :
            result =  -  ;
            System.out.println("Your result: " + result);
            break;
        case "*" :
            result =  *  ;
            System.out.println("Your result: " + result);
            break;
        case "/" :
            result =  /  ;
            System.out.println("Your result: " + result);
            break;
        default:
            System.out.println("Exit!");
            break;
    }

//    if(userinput == "/" && num1 == 0 || num2 == 0){
//        System.out.println("Error");
//    }
//        System.out.println(String.format("%.2f" ,divide));

    }
}
