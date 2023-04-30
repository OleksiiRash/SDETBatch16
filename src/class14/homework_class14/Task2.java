package class14.homework_class14;

public class Task2 {

/*
Task2:
Create a method createEmail().
Based on values of users firstName, lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
*/

    String createEmail(String firstName, String lastName, String email) {

        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(lastName.concat("@"));
        sb.append(email.concat(".com"));

        String sentence = sb.toString().toLowerCase();
        return sentence;
    }

    public static void main(String[] args) {

        Task2 obj = new Task2();

        String firstName = "John";
        String lastName = "Snow";
        String email = "gmail";

        String result = obj.createEmail(firstName, lastName, email);
        System.out.println(result);


    }
}
