package class11;

public class E1D2Array {
    public static void main(String[] args) {

        int[][] arr = {

                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        for (int i = 0; i < arr.length; i++) {  // i - means rows (4 rows)
            // j - means columns, when we use arr[i].length - means that we check elements in the rows (5 elements in the row)
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0)
                    System.out.print(arr[i][j] + " ");
                }

                System.out.println();
            }

        }
    }

