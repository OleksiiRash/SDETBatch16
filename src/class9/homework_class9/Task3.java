package class9.homework_class9;

public class Task3 {
    public static void main(String[] args) {

        /*
        Task 3: Create an array of words: Java, Saturday, day, coding, is.
        Print the following sentence using elements of array: “Saturday is Java coding day”.
         */

        String[] w = {"Java", "Saturday", "day", "coding", "is"};
        System.out.println(w[1] + " " + w[4] + " " + w[0] + " " + w[3] + " " + w[2]);

        System.out.println();

        String[] wNew = new String[5];
        wNew[0] = "Java";
        wNew[1] = "Saturday";
        wNew[2] = "day";
        wNew[3] = "coding";
        wNew[4] = "is";

        System.out.println(wNew[1] + " " + wNew[4] + " " + wNew[0] + " " + wNew[3] + " " + wNew[2]);


    }
}
