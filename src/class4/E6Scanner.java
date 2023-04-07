package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = scan.next();

        if (name.equals("Alex")){
            System.out.println("Windows user");
        } else if (name.equals("Mark")) {
            System.out.println("Mac User");
        } else {
            System.out.println("No User was found");
        }


    }
}
