package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // we need to initialize this command anyway to use scanner "new Scanner(System.in)"
        System.out.println("Please Enter Your Name");
        String name = scan.next();
        System.out.println("You Are amazing " + name);


    }
}
