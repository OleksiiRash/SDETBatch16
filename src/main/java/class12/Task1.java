package class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

/*
Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be empty, if so→ message=” Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=” Password is too short”.
Password cannot contain username if so, → message=” Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.
Only after all requirements met → message “Your username and password has been created”
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Create a username: ");
        String username = scan.nextLine();
        System.out.println("Create a pass: ");
        String pass = scan.nextLine();
        System.out.println("Confirm the pass: ");
        String confirmPass = scan.nextLine();

        if (username.isBlank() && pass.isBlank()) {
            System.out.println("Username or Password cannot be empty");
        } else if (pass.length() < 8) {
            System.out.println("Password is too short");
        } else if (pass.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!pass.equals(confirmPass)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username is: " + username);
            System.out.println("Your pass is: " + pass);
            System.out.println("Your username and password has been created");
        }


    }
}
