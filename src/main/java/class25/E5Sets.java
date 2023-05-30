package class25;

import java.util.Arrays;
import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {

        // Sorting the data based on first characters or by numbers
        TreeSet<String> colors = new TreeSet<>(Arrays.asList("Yellow", "Yellow", "Green", "Blue", "Red", "Orange"));
        System.out.println(colors);
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(2,10,4,3,11,7,9));
        System.out.println(numbers);




    }
}
