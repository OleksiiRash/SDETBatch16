package class10.homework_class10;

public class Task4 {

    public static void main(String[] args) {

        /*
        Task 4: Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
         */

        int [][] numbers = {
                {1,1,1},
                {1,1,1},
                {1,1,1}  // 18 in total
        };

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Sum = " + sum + " ");



    }
}

