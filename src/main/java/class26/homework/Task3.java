package class26.homework;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
*/

        var stringSet = new LinkedHashSet<>(Arrays.asList("Hello", "World", "I", "Love", "Java"));
        String cString = "";
        for (var str : stringSet) {
            cString += str;
        }

        System.out.println(cString);


    }
}
