package class10.projectHW;

public class Task8 {
    public static void main(String[] args) {

        // 8. Maximum and minimum number in the array?


        int[] numbers = {22, 14, 25, 18, 11, 17};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The max number in the array is " + max);
        System.out.println("The min number in the array is " + min);

    }
}
