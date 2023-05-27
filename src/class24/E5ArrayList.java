package class24;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        int num = 10;
        int num1 = 20;

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(num); // it allows us to store primitive data types
        numbers.add(num1);
        int num2 = numbers.get(0);
        System.out.println(num2);



    }
}
