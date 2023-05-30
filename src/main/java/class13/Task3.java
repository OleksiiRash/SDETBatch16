package class13;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String str = "Is it saturday! Is it raining? Do we have a Java Class today.";
        String[] strNew = str.split("[?!.]"); // we split the data wit regex and store in the array to count by indexes

        for (int i = 0; i < strNew.length; i++) {
            System.out.println(strNew[i].trim());
        }

        System.out.println(strNew.length);

    }
}
