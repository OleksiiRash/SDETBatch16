package class12.homework_class12;

public class Task1 {

    public static void main(String[] args) {

        /*
        Task 1: Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        For Example String str=hello =>l
         */

        String name = "hello";
        if (!name.isBlank() && name.length() % 2 != 0 && name.length() >= 3) {
            System.out.println(name.charAt(name.length() / 2));
        } else {
            if (name.isBlank()) {
                System.out.println("Empty String");
            }
            if (name.length() % 2 == 0) {
                System.out.println("String has an even number of letters");
            }
            if (name.length() < 3) {
                System.out.println("String has less than 3 number of letters");
            }
        }


    }
}
