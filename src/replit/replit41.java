package replit;

import java.util.Scanner;

public class replit41 {

    public static void main(String[] args) {

        /*
        For you to do:**
        Write a program using the switch statement
        Let us consider the scenario regarding the born baby age
        First Output: "Enter the age of the Child"
        case 1: if age is 1 print as "You can Crawl"
        case 2 : if age is 2 print as  "You can Talk"
        case 3: If age is 3 print as "You can Dance"
        case 4: if age is 4 print as "You can get Trouble"
        Other than this age (1-4) it should print "I don't know how old you are"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age = scan.nextInt();
        String result = "";

        switch (age) {
            case 1:
                result = "You can Crawl";
                break;
            case 2:
                result = "You can Talk";
                break;
            case 3:
                result = "You can Dance";
                break;
            case 4:
                result = "You can get Trouble";
                break;
            default:
                result = "I don't know how old you are";
        }

        System.out.println(result);

    }
}
