package class9.homework_class9;

public class Task6 {
    public static void main(String[] args) {

        // Task 6 Create an array of integers and calculate the sum of all elements in an array

        int count = 0;
        int[] n = {2, 3, 1, 4};
        for (int i = 0; i <= n.length-1; i++) {
            count +=i;
            count++;
        }

        System.out.println("Sum of " + n[0] + " + " + n[1] + " + " + n[2] + " + " + n[3] + " = " + count);

    }
}
