package replit;

import java.util.Scanner;

public class replit43 {
    public static void main(String[] args) {

        /*
        For you to do:**
        Write a program to input number "Input a number between 1-12" and when you input a number
        it should display the month using Scanner and Switch statement.

        case: 1 will display January
        case: 12 will display December

        Anything outside 12 will display "Invalid"
        Example Output:
        Input a number between 1-12
        Invalid
        **Example Output:**
        Input a number between 1-12
        January
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1-12");
        int n = scan.nextInt();
        String m = "";

        switch (n) {
            case 1:
                m = "January";
                break;
            case 2:
                m = "February";
                break;
            case 3:
                m = "March";
                break;
            case 4:
                m = "April";
                break;
            case 5:
                m = "May";
                break;
            case 6:
                m = "June";
                break;
            case 7:
                m = "July";
                break;
            case 8:
                m = "August";
                break;
            case 9:
                m = "September";
                break;
            case 10:
                m = "October";
                break;
            case 11:
                m = "November";
                break;
            case 12:
                m = "December";
                break;
            default:
                m = "Invalid";

        }

        System.out.println(m);

    }
}
