package replit;

import java.util.Scanner;

public class replit45 {
    public static void main(String[] args) {

        /*For you to do:**
        Ask the user to enter any number from 1-7.
        Based on the number define the day of the week
        Example Output:
        Input a number between 1-7
        Friday
        Example Output:
        Input a number between 1-7
        Invalid
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1-7");
        int num = scan.nextInt();
        String result = "";

        switch (num) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid";
        }

        System.out.println(result);


    }
}
