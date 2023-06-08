package class28.homework;

public class Task2 {
    public static void main(String[] args) {

/*
Task 2:
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.
*/

        String name = "Kevin";

        try {
            checkUserName(name);
            System.out.println("Name is equal or more than 5 characters");
        } catch (RuntimeException e) {
            System.out.println("Not eligible: " + e.getMessage());
        }


    }

    public static void checkUserName(String name) {
        if (name.length() < 5) {
            throw new RuntimeException("Username is less than 5 characters");
        }


    }


}
