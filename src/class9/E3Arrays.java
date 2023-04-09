package class9;

import java.util.Arrays;

public class E3Arrays {
    public static void main(String[] args) {

        double [] numbers = {10.5, 0.5, 1.5, 0.05, 100.5, 585}; // data inside the arrays is always integers!!!
        // 0, 1, 2, 3, 4, 5 - in this example

        for (int i = 0; i < numbers.length; i++) { // we use numbers.length to cover all numbers
        System.out.print(numbers[i] + " ");
        }

    }
}
