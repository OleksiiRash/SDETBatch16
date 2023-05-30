package class19.homework_class19;

public class Task3 {

/*
Task 3:
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
*/

    public static void printMessage() {
        System.out.println("Texts is Empty");
    }

    public static void printMessage(String input) {
        System.out.println("Text: " + input);
    }

    public static void printMessage(String input, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
        printMessage();
        printMessage("Hello, world!");
        printMessage("Java is awesome!", 3);
    }
}

