package class9;

import java.util.Scanner;

public class E13Arrays {
    public static void main(String[] args) {

        // Scanner + arrays + encased for loop

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the int numbers");

        int[] numbers = new int[3]; // here we declare how many numbers we need to ask user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int number : numbers) { // Enhanced for loop to print all faster in 1 line
            System.out.println(number);

        }
    }
}
