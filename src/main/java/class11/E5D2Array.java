package class11;

public class E5D2Array {

    public static void main(String[] args) {

        int[][] arr = {

                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        int count = 0;
        for (int[] arr2 : arr) {
            for (int arrNew : arr2) {
                if (arrNew % 2 == 0) {
                    count++;
                    System.out.print(arrNew + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Total even numbers = " + count);


    }
}
