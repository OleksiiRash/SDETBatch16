package class12.homework_class12;

public class Task2 {
    public static void main(String[] args) {

        // Task 2: Create a String and print it in reverse order (Sunday → yadnuS).

        String name = "Sunday";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}
