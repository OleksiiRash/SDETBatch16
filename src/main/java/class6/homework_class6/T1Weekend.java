package class6.homework_class6;

import java.util.Scanner;

public class T1Weekend {
    public static void main(String[] args) {

        /*
        Task 1: Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”, anyway from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the weekday, from 1 to 7");
        int number = scan.nextInt();

        if (number >= 1 && number <= 5) {
            System.out.println("It is a weekday");
        } else if (number >= 6 && number <= 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }

    }
}
