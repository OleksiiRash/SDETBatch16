package replit;

import java.util.Scanner;

public class replit37 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty = scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy = scan.nextBoolean();
        String result = "";

        if (thirsty && !sleepy) {  // If user is thirsty and not sleepy--> drink=water
            result = "water";
        } else if (thirsty && sleepy) { // If user is thirsty and sleepy--> drink=coffee
            result = "coffee";
        } else if (!thirsty && sleepy) { // If user is not thirsty and sleepy --> drink=tea
            result = "tea";
        } else { // Otherwise, drink="nothing"
            result = "nothing";
        }

        System.out.println("Looks like you need to drink " + result);

    }
}
