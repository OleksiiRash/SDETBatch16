package class25;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Task3 {

    public static void main(String[] args) {


        LinkedHashSet<String> cities = new LinkedHashSet<>(Arrays.asList("Valencia", "Amsterdam", "Ney-York", "Toronto", "Astana", "Ukraine"));
        System.out.println(cities);
        System.out.println("--------------------------");
        cities.removeIf(city -> city.startsWith("A"));

        for (String c : cities) {
            System.out.println(c);
        }


    }
}
