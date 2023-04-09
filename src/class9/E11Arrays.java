package class9;

public class E11Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // create an array of integers of 5 - only declaring the count

        // in this way we declare the future values

        numbers[0] = 50;
        numbers[1] = 100;
        numbers[2] = 25;
        numbers[3] = 30;
        numbers[4] = 40;

        for (int number : numbers) {  // Enhanced for loop
            System.out.println(number);
        }

        System.out.println();

        String[] flags = new String[5];

        flags[0] = "US"; // 1
        flags[1] = "CA"; // 2
        flags[2] = "FR"; // 3
        flags[3] = "ES"; // 4
        flags[4] = "UA"; // 5

        for (String name : flags) {
            System.out.println(name);

        }


    }
}
