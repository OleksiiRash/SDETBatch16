package class4.homework_class4;

import java.util.Scanner;

public class Task3ScannerDMV {
    public static void main(String[] args) {

        /*
        Task 3: You are DMV representative, and you need to ask customer their age.
        If they are 18 and older you will issue a driver license to them, otherwise you
        will offer them to get a learners permit.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("What is Your Age?");
        int age = scan.nextInt();
        if (age >= 18){
            System.out.println("Driver Licence is Issued");
        }
        else {
            System.out.println("Try to get a learners permit");
        }

    }
}
