package class10.projectHW;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /*
        6. Write a java program to check whether a given
        number is prime or not?

        A prime number is a positive integer greater than 1
        that has no positive integer divisors other than 1 and itself.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();
        boolean prime = false;

        if (number < 2) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = true;
                }
            }
            if (!prime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }


    }
}
