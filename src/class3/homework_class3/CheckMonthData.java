package class3.homework_class3;

public class CheckMonthData {
    public static void main(String[] args) {

        // Based on the value of the variable your program should print the name of the month

        int month = 3;

        if (month == 3) {
            System.out.println("March");
        } else {
            System.out.println("Invalid month number");
        }

        // Check Positive or Negative

        if (month > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // Write a Java Program to check whether number is Even or Odd

        if (month % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
