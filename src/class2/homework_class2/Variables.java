package class2.homework_class2;

public class Variables {
    public static void main(String[] args) {

        /*
        Task 2: Create a Java program and name it Variables
        In your program create different type of variables to store student’s information:
        (name, last name, grade, city, state, phone number)
        and then print value of those variables in the format:
        My name is __ and my last name is __
        I am __ student
        I live in city and country __
        And my phone number is __
         */

        String myName = "Alex";
        String lastName = "Rash";
        char myGrade = 'B';
        int myAge = 33;
        String myCity = "Madrid";
        String myCountry = "Spain";
        String myPhoneNumber = "+34457845124";
        boolean myCitizenshipStatus = false;

        System.out.println("My name is" + " " + myName + " " + "and my last name is" + " " + lastName);
        System.out.println("I am" + " " + myGrade + " " + "student");
        System.out.println("My age is" + " " + myAge + " " + "years old");
        System.out.println("I live in" + " " + myCity + " " + "and country" + " " + myCountry);
        System.out.println("My phone number is" + " " + myPhoneNumber);

        if (myCitizenshipStatus == true) {
            System.out.println("And my citizenship status: Spanish nationality not by origin");}
        if (myCitizenshipStatus == false) {
            System.out.println("And my citizenship status: Temporary Residence");}

        // Task 3: Change student’s city, state, phone number and grade. And print those updated values

        String divider = "-------------------------------------------------------";
        myGrade = 'A'; // Task 3: updated data
        myCity = "Valencia"; // Task 3: updated data
        myPhoneNumber = "+34457845245"; // Task 3: updated data

        System.out.println(divider);
        System.out.println("My name is" + " " + myName + " " + "and I moved to new city" + " " + myCity + " " + "and my new phone number is:" + " " + myPhoneNumber);
    }
}
