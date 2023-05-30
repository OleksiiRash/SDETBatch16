package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary = scan.nextInt();
        if(salary>100000){
            System.out.println("You Are Rich");
        }
        else {
            System.out.println("Look for better opportunities");
        }


    }
}
