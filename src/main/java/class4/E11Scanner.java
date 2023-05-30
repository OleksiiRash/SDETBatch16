package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        if we want to take a complete line from the user we
        should use nextLine method
         */

        System.out.println("Enter your sentence here");
        String sentence = scan.nextLine(); // we show full line with this "scan.nextLine();" otherwise we will get only first word
        System.out.println(sentence);


    }
}
