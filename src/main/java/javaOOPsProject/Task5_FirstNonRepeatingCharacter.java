package javaOOPsProject;

public class Task5_FirstNonRepeatingCharacter {

/*
Task 5:

Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
*/

    public static void NonRepeatingCharacter(String words) {
        for (int i = 0; i < words.length(); i++) {
            char currentChar = words.charAt(i);
            boolean isRepeating = false;

            for (int j = 0; j < words.length(); j++) {
                if (i != j && currentChar == words.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                System.out.println("The first non-repeating character is: " + currentChar);
                return;
            }
        }
    }


    public static void main(String[] args) {

        NonRepeatingCharacter("abracadabra");

    }
}
