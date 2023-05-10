package class19.homework_class19;

public class Task4 {

/*
Task 4:
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
*/

    private void printMessage() {
        System.out.println("Private Mode");
    }

    private void printMessage(String input) {
        System.out.println("Text: " + input);
    }

    private void printMessage(String input, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(input);
        }
    }

    public static void main(String[] args) {

        Task4 obj = new Task4();
        obj.printMessage();
        obj.printMessage("How Are U?");
        obj.printMessage("Private Method in Java!", 1);
    }
}
