package class9;

public class E12Arrays {
    public static void main(String[] args) {

        // нужно разобрать очень сложно к понимание, encased for loop

        int[] numbers = new int[5]; // create an array of integers of 5
        int num = 50;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
            num = num + 10;
        }

        for (int number : numbers) { // Enhanced for loop
            System.out.println(number);

        }


    }
}
