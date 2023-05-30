package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are U Hungry? Enter the True or False");

        boolean hungry = scan.nextBoolean();
        if(hungry){
            System.out.println("Lets order Pizza");
        }
        else {
            System.out.println("Lets Practice Java");
        }



    }
}
