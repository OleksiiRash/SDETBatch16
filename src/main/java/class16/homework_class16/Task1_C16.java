package class16.homework_class16;

public class Task1_C16 {

/*
Task 1:
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
*/

    public static String reverse(String input) {
        StringBuilder newReverce = new StringBuilder(input);
        newReverce.reverse();
        String r = newReverce.toString();
        return r;
    }

    public static void main(String[] args) {

        String result = Task1_C16.reverse("Mark");
        System.out.println(result);


    }
}
