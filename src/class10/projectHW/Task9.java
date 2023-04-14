package class10.projectHW;

public class Task9 {
    public static void main(String[] args) {

        // 9. Write a java program to find the second-largest number in the array?

        int[] numbers = {27, 14, 31, 18, 11, 17};

        int max = numbers[0];
        int maxSecond = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] > maxSecond && numbers[i] < max) {
                maxSecond = numbers[i];
            }
        }

        System.out.println("The max number in the array is " + max);
        System.out.println("The second max number in the array is " + maxSecond);

    }
}
