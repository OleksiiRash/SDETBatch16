package class28;

import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter any number: ");
            int num = scan.nextInt();
            System.out.println("Your number is " + num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("User entered the text not only numbers");
        }

    }
}
