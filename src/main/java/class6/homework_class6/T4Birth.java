package class6.homework_class6;

import java.util.Locale;
import java.util.Scanner;

public class T4Birth {
    public static void main(String[] args) {

        /*
        Task 4: Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in March, April, May → season = ”Spring”
        if user is born in June, July, August → season =”Summer”  etc …
        At the end of the program we should see 1 output as “You were born in the season of " + season __”.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth month:");

        // toLowerCase() means that we will auto convert the name of the month from uppercase to lowercase on the backend

        String month = scan.nextLine().toLowerCase();
        String season = "";

        switch (month) {
            case "december":
            case "january":
            case "february":
                season = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "Autumn";
                break;
            default:
                System.out.println("Invalid Data");
        }
        System.out.println("You were born in the season of " + season);

    }
}
