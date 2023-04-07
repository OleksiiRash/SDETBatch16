package replit;

import java.util.Scanner;

public class replit36 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two words");
        String one = scan.nextLine();
        String two = scan.nextLine();

        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (one.equals(two) && num1 == num2) { // if int1 and int2 are equal && word1 and word2 are equal, output "AND"
            System.out.println("AND");
        } else if (one.equals(two) || num1 == num2) { // if int1 and int2 are equal || word1 and word2 are equal, output "OR"
            System.out.println("OR");
        } else if (!(one.equals(two)) && num1 != num2) { // if int1 and int2 are !equal && word1 and word2 are !equal, output "NONE"
            System.out.println("NONE");
        }


    }
}
