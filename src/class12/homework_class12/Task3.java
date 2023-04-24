package class12.homework_class12;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

/*
Task 3: Write a program that reads two people's first
names and if they're expecting boy or girl?
Based on the input suggests a name for a baby:

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String momsName = scan.nextLine();
        momsName = momsName.toUpperCase();
        System.out.println("Dad’s first name?");
        String dadsName = scan.nextLine();
        dadsName = dadsName.toUpperCase();
        System.out.println("Boy or Girl?");
        String boysOrGirls = scan.nextLine();

        if (boysOrGirls.equalsIgnoreCase("boy")) {
            System.out.println(dadsName.substring(0, dadsName.length() / 2) + momsName.substring(momsName.length() / 2));
        } else if (boysOrGirls.equalsIgnoreCase("girl")) {
            System.out.println(momsName.substring(0, momsName.length() / 2) + dadsName.substring(dadsName.length() / 2));
        } else {
            System.out.println("Please enter boy or girl");
        }

    }
}