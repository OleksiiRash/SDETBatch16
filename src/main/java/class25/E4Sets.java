package class25;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {

        // no duplicates, but it remembers the order (allow work with indexes)
        LinkedHashSet<String> colors = new LinkedHashSet<>(Arrays.asList("Yellow", "Yellow", "Green", "Blue", "Red", "Orange"));
        System.out.println(colors);



    }
}
