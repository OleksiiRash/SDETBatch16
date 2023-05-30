package javaOOPsProject;

public class Task3_CountNofWords {

/*
Task 3:

Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
*/

    public static void countNofWords(String text) {
        String[] strArr = text.split("[\\s,.;:!?]+");
        System.out.println(strArr.length);

    }

    public static void main(String[] args) {

        countNofWords("Hello, world!");

    }
}
