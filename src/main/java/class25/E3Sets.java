package class25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class E3Sets {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Farwa", "Farwa"));
        System.out.println(names);
        System.out.println("-----------------------------");

        // HashSet doesn`t allow duplicate data. Only one value will be return form the 2 duplicate values
        // Doesn`t remember the order in which we insert the data!
        // no get method, data not stored based on the indexes
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList("Yellow", "Yellow", "Green", "Blue", "Red", "Orange"));
        for (String n : uniqueNames) {
            System.out.println(n);
        }


    }
}
