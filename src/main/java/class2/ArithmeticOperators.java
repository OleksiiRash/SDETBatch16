package class2;
public class ArithmeticOperators {

    public static void main(String[] args) {

         /*
        Arithmetic operators in java are symbols that we use to perform simple basic
        Arithmetic operations like Addition(+) subtraction(-) multiplication(*)
        Division(/) modules operator(%)
         */

        int number1 = 14;
        int number3 = 2;
        int number2 = number1;
        int sum1 = number1 + number3;
        int divider = number1/number3;
        double number7 = 11.0;
        double number8 = 5.0;


        System.out.println(number1+number3);
        System.out.println(number1-number3);
        System.out.println(number1*number3);
        System.out.println(number1/number3);
        System.out.println(11.0/5.0); // if we need to calculate the decimal numbers we need to convert those numbers in decimal or double data type
        System.out.println(number7/number8);
        System.out.println(sum1);
        System.out.println(divider);

        /*modules operator(%) - The modulus operator is often used in programming to perform certain
        operations based on whether a number is even or odd.
        The modulus operator % in Java returns the remainder of the division
        between two integers. For example, the expression 7 % 3 evaluates to 1,
        because when 7 is divided by 3, the remainder is 1.
        The modulus operator can be used with both positive and negative integers.
        When the left operand is negative, the result of the expression is negative:
         -7 % 3 // evaluates to -1
         */

        int num = 9;
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        int a = 10;
        int b = 3;
        int remainder = a%b; // will be 1, because 10 it is 3 times 3 + 1

        System.out.println(remainder);

        // Adding the values of two variables and storing the results in sum variable

        int number5 = 10;
        int number6 = 20;
        int sum=number5+number6;

        System.out.println(sum);

        double doubleNumber1=0.5;
        double doubleNumber2=0.5;
        double doubleSum=doubleNumber1+doubleNumber2;

        System.out.println(doubleSum);

        /*
         Relation Operators in Java:

         == equal to
         != not equal to
         <= less than or equal to
         >= greater or equal to
         < less than
         > greater
         */

        int d = 20, e = 30; // можно записывать несолько variables and values сразу в data type как указано тут.
        if (d != e) {
            System.out.println("Its True!");
        }
        else
        {
            System.out.println("Its False!");
        }

        double f = 44.5, g = 55.5, h = 23.5;
        f = 45.5;
        g = 65.5;
        h = 24.5;

        if (f >= h && g >= h) { // && - we can use this operator to add extra variable
            System.out.println("Great True Things!");
        }
        else
        {
            System.out.println("Not True Things!");
        }



     }
    }
