package class6.homework_class6;

import java.util.Scanner;

public class T6Country {
    public static void main(String[] args) {

        /*
        Task 6: Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Country and we define your language:");
        String country = scan.nextLine().toLowerCase();
        String language = "";

        // not all countries included as because it is only for demonstration!

        switch (country) {
            case "united states":
                language = "English";
                break;
            case "france":
                language = "Spanish";
                break;
            case "italy":
                language = "Italian";
                break;
            case "germany":
                language = "German";
                break;
            case "ukraine":
                language = "Ukrainian";
                break;
            default:
                System.out.println("Unknown");
        }
        System.out.println("Your language is " + language);

    }
}
