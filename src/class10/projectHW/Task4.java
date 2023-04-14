package class10.projectHW;

import java.sql.SQLOutput;

public class Task4 {
    public static void main(String[] args) {

        /*
        4. Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
         */

        int[][] numbers = {
                {1, 12, 5, 2},
                {4, 3, 5, 7},
                {6, 9, 11, 13}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];
                } else if (numbers[i][j] % 2 != 0) {
                    sumOdd += numbers[i][j];
                }
            }
        }

        System.out.println("The Sum of Even Numbers = " + sumEven);
        System.out.println("The Sum of Odd Numbers = " + sumOdd);


    }
}
