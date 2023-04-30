package class14.homework_class14;

public class Task3 {

/*
Task3:
Write a method to return whether given number is prime or not?
*/

    String prime(int number) {
        boolean prime = false;

        if (number < 2) {
            return number + " is not a prime number";
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = true;
                }
            }
            if (!prime) {
                return number + " is a prime number.";
            } else {
                return number + " is not a prime number.";
            }
        }
    }

    public static void main(String[] args) {

        Task3 obj = new Task3();
        int num = 1;
        String result = obj.prime(num);
        System.out.println(result);


    }
}
