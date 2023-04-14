package class10.projectHW;

public class Task2 {

    public static void main(String[] args) {

        /*
        2. Create an array of integer values. After the array is
        created, calculate the sum of all stored elements in
        that array.
         */

        int sum = 0;
        int[] values = {22, 14, 25, 18, 11, 17};
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }
}
