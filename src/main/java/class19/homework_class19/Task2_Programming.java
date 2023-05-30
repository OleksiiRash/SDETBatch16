package class19.homework_class19;

public class Task2_Programming {

/*
Create a class named 'Task2_Programming'.
While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.
*/


    public static void printWord() {
        System.out.println("I love programming languages");
    }

    public static void printWord(String word) {
        System.out.println("I love " + word);
    }


    public static void main(String[] args) {

        Task2_Programming.printWord();
        Task2_Programming.printWord("Java");


    }
}
