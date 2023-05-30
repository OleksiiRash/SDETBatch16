package class6.homework_class6;

import java.util.Scanner;

public class T9Repl033 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        double numAny = scan.nextDouble();

        if (numAny % 2 == 0) {
            System.out.println("Value is even");
            if (numAny > 1000)
                System.out.println("Even value is large");
            else
                System.out.println("Even value is just right");
        }
        if ((numAny % 2) != 0) {
            System.out.println("Value is odd");
            if (numAny % 2 != 0 && numAny > 1000)
                System.out.println("odd number is large");
            else
                System.out.println("Odd value is just right");
        }


    }
}
