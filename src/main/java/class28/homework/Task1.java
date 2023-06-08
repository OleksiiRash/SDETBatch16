package class28.homework;

public class Task1 {
    public static void main(String[] args) {

/*
Task 1:
Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.
*/

        int age = 15;

        try {
            ageEligibility(age);
            System.out.println("Eligible!");
        } catch (RuntimeException e) {
            System.out.println("Not eligible: " + e.getMessage());
        }
    }

    public static void ageEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }


    }

}
