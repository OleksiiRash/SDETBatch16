package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Is it time for break: true/false?");
        boolean isBreak = scan.nextBoolean();

        if (isBreak){ // we don`t need to write == true/false as it is already contains "true" by default
            System.out.println("Lets have a break");
        }
        else {
            System.out.println("Lets study");
        }


    }
}
