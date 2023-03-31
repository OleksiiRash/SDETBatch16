package class6.homework_class6;

import java.util.Scanner;

public class T8Calculator {
    public static void main(String[] args) {

        /*
        Task 8: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator (+,-,*,/). Based on operator provide the result to user.
        Please complete this assignment in 2 ways: using if statement and switch case.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator: please enter the first number");
        double num1 = scan.nextDouble();

        System.out.println("Calculator: please enter the operator (+,-,*,/)");
        char operator = scan.next().charAt(0);

        System.out.println("Calculator: please enter the second number");
        double num2 = scan.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;
        double result = 0;

        /* if (operator == '+') {
            result = sum;
        } else if (operator == '-') {
            result = sub;
        } else if (operator == '*') {
            result = multi;
        } else if (operator == '/') {
            result = div;
        }
        else {
            System.out.println("Error: please repeat with correct operator");
        }

        System.out.println("Result = " + result);
        */

        switch (operator) {
            case '+':
                result = sum;
                break;
            case '-':
                result = sub;
                break;
            case '*':
                result = multi;
                break;
            case '/':
                result = div;
                break;
            default:
                System.out.println("Error: please repeat again with correct operator");
        }

        System.out.println("Result " + result);

    }
}
