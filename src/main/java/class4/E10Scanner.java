package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender");

        /*
        There is no direct method for the char datatype in scanner class
        we use a workaround we first use the next method to take a String from
        the user and from that String we extract the first letter by passing
        0 to the charAt() method.
         */

        char gender = scan.next().charAt(0);
        System.out.println("You entered " + gender);

    }
}
