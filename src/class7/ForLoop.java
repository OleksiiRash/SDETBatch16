package class7;

public class ForLoop {
    public static void main(String[] args) {

        // for loop

        for (int i = 0; i < 5; i++) {
            System.out.println("Milana");
        }

        // for loop option 2

        for (int i = 0; i <= 10; i++) {  // if we need to repeat something exactly needed amount of times don`t forget to use =
            System.out.println(i);
        }

        // array loop

        int[] numbers = {100, 45, 78, 47, 20, 02, 13};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // numbers[i] - we print values inside of numbers
        }


    }
}
