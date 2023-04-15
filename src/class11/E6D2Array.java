package class11;

public class E6D2Array {

    public static void main(String[] args) {

        int[][] numbers = {

                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            System.out.println("Sum = " + sum + " ");
        }

    }
}
