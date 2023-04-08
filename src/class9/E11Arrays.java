package class9;

public class E11Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // create an array of integers of 5

        // in this way we declare the future values

        numbers[0] = 50;
        numbers[1] = 100;
        numbers[2] = 25;
        numbers[3] = 30;
        numbers[4] = 40;

        for (int number : numbers) {  // Enhanced for loop
            System.out.println(number);

        }


    }
}
