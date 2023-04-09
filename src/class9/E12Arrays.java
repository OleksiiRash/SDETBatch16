package class9;

public class E12Arrays {
    public static void main(String[] args) {

        // a little harder for understanding

        int[] numbers = new int[5]; // create an array of integers of 5
        int num = 50; // declare + initialize
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
            num += 10; // num = num + 10;
        }

        for (int number : numbers) {
            System.out.println(number + " ");

        }

    }
}
