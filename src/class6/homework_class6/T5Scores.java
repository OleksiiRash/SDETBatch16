package class6.homework_class6;

import java.util.Scanner;

public class T5Scores {
    public static void main(String[] args) {

        /*
        Task 5: Write a program that will read three inputs of scores (quiz, mid-term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Quiz Score in points from 0 to 100:");
        int qS = scan.nextInt();
        System.out.println("Enter Your Mid-Term Score in points from 0 to 100:");
        int mS = scan.nextInt();
        System.out.println("Enter Your Final Score in points from 0 to 100:");
        int fS = scan.nextInt();
        int avr = (qS + mS + fS) / 3;

        if (avr >= 90) {
            System.out.println("Your grade is A");
        } else if (avr >= 70 && avr < 90) {
            System.out.println("Your grade is B");
        } else if (avr >= 50 && avr < 70) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
