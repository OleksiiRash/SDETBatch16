package class14;

import com.sun.tools.javac.Main;

public class Task1 {

/*
Write code that will take in a String input and check to see if it is a
palindrome or not.
A palindrome means that the characters are the same forwards and
backwards, ignoring spaces examples level madam kayak
 */

    boolean isPalindrome(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrPalindrome = true;
        }
        return isStrPalindrome;
    }


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        boolean result = task1.isPalindrome("level");
        System.out.println(result);


    }
}

