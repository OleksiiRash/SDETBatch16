package javaOOPsProject;

public class Task2_CheckPalindrome {

/*
Task 2:

Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
*/

    public static void checkPalindrome(String word) {
        StringBuilder check = new StringBuilder(word);
        String c = check.reverse().toString();
        if (c.equalsIgnoreCase(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        checkPalindrome("MadaM");

    }
}
