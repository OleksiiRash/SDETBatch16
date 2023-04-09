package class9.homework_class9;

public class Task7 {
    public static void main(String[] args) {

        // Task 7 From an array of integer elements find the largest number


        int[] numbers = {10, 5, 3, 1, 12};
        int largeN = numbers[0]; // 10
        for (int i = 1; i <= numbers.length - 1; i++) {
            if (numbers[i] > largeN) { // 12 > 10 = true
                largeN = numbers[i]; // here we reassign the value 10 to the largest number 12, as because if = true for the 12
            }
        }
        System.out.println(largeN);

    }
}
