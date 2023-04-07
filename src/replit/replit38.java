package replit;

import java.util.Scanner;

public class replit38 {

/*
For you to do:**
Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"

Output:
Today you will be learning ____
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weekend = scan.nextBoolean();
        String result = "";

        if (!weekend) {
            result = "manual testing";
        } else {
            result = "Java";
        }

        System.out.println("Today you will be learning " + result);


    }
}

