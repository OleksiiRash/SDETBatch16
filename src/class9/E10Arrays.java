package class9;

public class E10Arrays {
    public static void main(String[] args) {

        int[] numbers = {45, 50, 20, 30, -50, 45};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        System.out.println();

        // Enhanced for loop, or we can type "iter" - (Encased for loop) or place the cursor on the for loop and click the bulb

        int[] numbersNew = {45, 50, 20, 30, -50, 45};
        for (int j : numbersNew) {
            System.out.print(j);
        }


    }
}
