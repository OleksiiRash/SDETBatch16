package replit;

import java.util.Scanner;

public class replit39 {
    public static void main(String[] args) {

        /*
        A school has the following rules for grading system:
        a. 1 to 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A

        Ask the user to enter marks and print the corresponding grade.

        **Example Output:**
        Please enter your mark
        Your grade is A
        Example Output:
        Please enter your mark
        Please enter valid mark
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int m = scan.nextInt();
        String result = "";

        if (m >= 1 && m <= 25) {
            result = "F";
        } else if (m >= 25 && m <= 45) {
            result = "E";
        } else if (m >= 45 && m <= 50) {
            result = "D";
        } else if (m > 50 && m <= 60) {
            result = "C";
        } else if (m > 60 && m <= 80) {
            result = "B";
        } else if (m >= 81) {
            result = "A";
        } else {
            result = "Please enter valid mark";
        }

        System.out.println("Your grade is " + result);


    }
}
