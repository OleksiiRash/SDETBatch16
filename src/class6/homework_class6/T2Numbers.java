package class6.homework_class6;

import java.util.Scanner;

public class T2Numbers {
    public static void main(String[] args) {

        /*
        Task 2: Ask user to enter a number and then define if number is small, medium or large
        Small number is value between 1 and 10
        Medium number is value between 11 and 100
        Large number is value between 101 and 1000
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter the number");
        int n = scan.nextInt();

        if (n>=1 && n<=10){
            System.out.println("Small Number");
        }
        else if (n>=11 && n<=100){
            System.out.println("Medium Number");
        }
        else if (n>=101 && n<=1000) {
            System.out.println("Large Number");
        }
        else {
            System.out.println("Another Number");
        }
    }
}
