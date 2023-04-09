package class9.homework_class9;

public class Task3 {
    public static void main(String[] args) {

        /*
        Task 3: Create an array of words: Java, Saturday, day, coding, is.
        Print the following sentence using elements of array: “Saturday is Java coding day”.
         */

        String[] words = {"Java", "Saturday", "day", "coding", "is"};
        System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

        System.out.println();

        String[] wordsNew = new String[5];
        wordsNew[0] = "Java";
        wordsNew[1] = "Saturday";
        wordsNew[2] = "day";
        wordsNew[3] = "coding";
        wordsNew[4] = "is";

        System.out.println(wordsNew[1] + " " + wordsNew[4] + " " + wordsNew[0] + " " + wordsNew[3] + " " + wordsNew[2]);


    }
}
